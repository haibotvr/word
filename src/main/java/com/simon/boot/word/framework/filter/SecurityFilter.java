package com.simon.boot.word.framework.filter;

import com.simon.boot.word.framework.kits.*;
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
        if (this.isExclusion(requestURI)) {
            filterChain.doFilter(httpServletRequest, httpServletResponse);
        }else {
            //获取请求中header参数
            Claims claims = JwtHelper.parseJWT(httpServletRequest.getHeader(LeafConstant.HTTP_TOKEN));
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

    public boolean isExclusion(String requestURI) {

        if (this.excludesPattern == null) {
            return false;
        } else {
            if (this.contextPath != null && requestURI.startsWith(this.contextPath)) {
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
        }
    }

    public String getRequestURI(HttpServletRequest request) {
        return request.getRequestURI();
    }

}
