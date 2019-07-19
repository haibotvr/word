package com.simon.boot.word.framework.aop;

import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.kits.UserUtil;
import com.simon.boot.word.framework.web.WebLog;
import com.simon.boot.word.pojo.WordUser;
import io.micrometer.core.instrument.util.StringUtils;
import io.swagger.annotations.ApiOperation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author simon.wei
 */
@Aspect
@Component
@Order(1)
public class WebLogAspect {

    private static final Logger log = LoggerFactory.getLogger(WebLogAspect.class);

    @Pointcut("execution(public * com.simon.boot.word.controller.word.*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {}

    @AfterReturning(value = "webLog()", returning = "obj")
    public void doAfterReturning(Object obj) {}

    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        //获取当前请求对象
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //记录请求信息
        WebLog webLog = new WebLog();
        Object result = joinPoint.proceed();
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        long endTime = System.currentTimeMillis();
        String urlStr = request.getRequestURL().toString();
        String uriStr = request.getRequestURI();
        String methodPackage = method.getDeclaringClass() + "." + method.getName();
        if(method.isAnnotationPresent(ApiOperation.class)){
            ApiOperation apiOperation = method.getAnnotation(ApiOperation.class);
            webLog.setDescription(apiOperation.value());
        }
        webLog.setUsername(UserUtil.get() == null ? "default" : ((WordUser)UserUtil.get()).getLoginName());
        webLog.setBasePath(urlStr.replace(uriStr, ""));
        webLog.setIp(request.getRemoteAddr());
        webLog.setMethod(request.getMethod());
        webLog.setParameter(getParameter(method, joinPoint.getArgs()));
        webLog.setResult(result);
        webLog.setSpendTime((int)(endTime - startTime));
        webLog.setStartTime(startTime);
        webLog.setUri(uriStr);
        webLog.setUrl(urlStr);
        log.info("{},{}", methodPackage, JsonUtil.toString(webLog));
        return result;
    }

    /**
     * 根据方法和传入参数获取请求参数
     */
    private Object getParameter(Method method, Object[] args){
        List<Object> argList = new ArrayList<>();
        Parameter[] parameters = method.getParameters();
        for (int i = 0; i < parameters.length; i++) {
            //将RequestBody注解修饰的参数作为请求参数
            RequestBody requestBody = parameters[i].getAnnotation(RequestBody.class);
            if(requestBody != null){
                argList.add(args[i]);
            }
            //将RequestParam注解修饰的参数作为请求参数
            RequestParam requestParam = parameters[i].getAnnotation(RequestParam.class);
            if(requestParam != null){
                Map<String, Object> map = new HashMap<>();
                String key = parameters[i].getName();
                if(StringUtils.isNotBlank(requestParam.value())){
                    key = requestParam.value();
                }
                map.put(key, args[i]);
                argList.add(map);
            }
        }
        if(CollectionUtils.isEmpty(argList)){
            return null;
        }else{
            return argList;
        }
    }

}
