package com.simon.boot.word.framework.aop;

import com.simon.boot.word.framework.kits.DataValidationUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class BeanAspect {

    @Before("@annotation(com.simon.boot.word.framework.annotation.BeanValid)")
    public void checkBeanValid(JoinPoint joinPoint) throws Exception {
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        args.stream().forEach(obj -> {
            DataValidationUtil.validate(obj);
        });
    }
}
