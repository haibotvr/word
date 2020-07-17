package com.simon.boot.word.framework.filter;

import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.JwtTokenUtil;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JWT登录授权过滤器
 * @author simon.wei
 */
@Slf4j
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Value("${jwt.oaHead}")
    private String oaHead;

    @Value("${jwt.udpHead}")
    private String udpHead;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain) throws ServletException, IOException {
        //获取用户token
        String authHeader = request.getHeader(this.tokenHeader);
        //检验token
        if(StringUtils.isNotBlank(authHeader)) {
            String authToken = null;
            String username = null;
            if(authHeader.startsWith(this.tokenHead)) {
                authToken = authHeader.substring(this.tokenHead.length());
                username = jwtTokenUtil.getUserNameFromToken(authToken);
            }else if(authHeader.startsWith(this.oaHead)) {
                authToken = authHeader.substring(this.oaHead.length());
                username = jwtTokenUtil.getUserNameFromToken(authToken);
            }else if(authHeader.startsWith(this.udpHead)) {
                authToken = authHeader.substring(this.udpHead.length());
                username = jwtTokenUtil.getUserNameFromToken(authToken);
            }
            //统一授权
            if(StringUtils.isNotBlank(username) && SecurityContextHolder.getContext().getAuthentication() == null){
                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
                if(jwtTokenUtil.validateToken(authToken, userDetails)){
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    log.info("authenticated user:{}", username);
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }

        chain.doFilter(request, response);
    }
}
