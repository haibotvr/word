package com.simon.boot.word.framework.filter;

import com.simon.boot.word.framework.exception.AuthenticationException;
import com.simon.boot.word.framework.kits.*;
import com.simon.boot.word.framework.web.ReturnValue;
import io.jsonwebtoken.Claims;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Slf4j
public class SecurityFilter implements Filter {

    public static final String PARAM_NAME_EXCLUSIONS = "exclusions";
    private Set<String> excludesPattern;
    protected String contextPath;
    protected PatternMatcher pathMatcher = new ServletPathMatcher();

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;
        String requestURI = this.getRequestURI(httpServletRequest);
        if (this.isExclusion(requestURI, httpServletRequest)) {
            filterChain.doFilter(httpServletRequest, httpServletResponse);
        }else {
            //获取请求中header参数
            Claims claims;
            try {
                claims = JwtHelper.parseJWT(httpServletRequest.getHeader(LeafConstant.HTTP_TOKEN));
            } catch (AuthenticationException e) {
                httpServletResponse.setCharacterEncoding("UTF-8");
                JsonUtil.mapper.writeValue(httpServletResponse.getWriter(), ReturnValue.error().setCode(e.getCode().intValue()).setMessage(e.getMessage()));
                return;
            }
            httpServletRequest.getSession().setAttribute(LeafConstant.SESSION_USER,
                    JsonUtil.toString(claims.get(LeafConstant.SESSION_USER, LinkedHashMap.class)));
            filterChain.doFilter(httpServletRequest, httpServletResponse);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String param = filterConfig.getInitParameter(PARAM_NAME_EXCLUSIONS);
        if (StringUtils.isNotBlank(param)) {
            this.excludesPattern = new HashSet(Arrays.asList(param.split("\\s*,\\s*")));
        }
    }

    @Override
    public void destroy() {

    }

    public boolean isExclusion(String requestURI, HttpServletRequest request) {
        this.setContextPath(request.getContextPath());
        if (this.excludesPattern != null) {
            if (requestURI.startsWith(this.contextPath)) {
                requestURI = requestURI.substring(this.contextPath.length());
                if (!requestURI.startsWith("/")) {
                    requestURI = "/" + requestURI;
                }
            }
            Iterator iterator = this.excludesPattern.iterator();
            String pattern;
            while (true) {
                if (iterator.hasNext()){
                    pattern = (String) iterator.next();
                    if (this.pathMatcher.matches(pattern, requestURI)){
                        return true;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public String getRequestURI(HttpServletRequest request) {
        return request.getRequestURI();
    }

}
