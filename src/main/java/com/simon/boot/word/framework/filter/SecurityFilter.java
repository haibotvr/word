package com.simon.boot.word.framework.filter;

import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.kits.JwtHelper;
import com.simon.boot.word.framework.kits.LeafConstant;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;

@Slf4j
public class SecurityFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {
        String uri = httpServletRequest.getRequestURI();
        if("/word/user/login".equals(uri)){
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }
        if("/word/user/logout".equals(uri)){
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }
        if("/word/extra/login".equals(uri)){
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }
        //获取请求中header参数
        Claims claims = JwtHelper.parseJWT(httpServletRequest.getHeader(LeafConstant.HTTP_TOKEN));
        httpServletRequest.getSession().setAttribute(LeafConstant.SESSION_USER,
                JsonUtil.toString(claims.get(LeafConstant.SESSION_USER, LinkedHashMap.class)));
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
