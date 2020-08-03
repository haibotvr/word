package com.simon.boot.word.framework.filter;

import org.slf4j.MDC;

import javax.servlet.*;
import java.io.IOException;
import java.util.UUID;

/**
 * @author simon.wei
 */
public class LoggerMDCFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        MDC.put("mdcRequestId", UUID.randomUUID().toString());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
