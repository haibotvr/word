package com.simon.boot.word.framework.exception;

import cn.hutool.json.JSONUtil;
import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.framework.web.ReturnValue;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author simon.wei
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter()
                .println(JSONUtil.parse(ReturnValue.error()
                                .setCode(BusinessExceptionMessage.AUTHENTICATION_FAILED.getValue())
                                .setMessage(BusinessExceptionMessage.AUTHENTICATION_FAILED.getName()).setData(e.getMessage())
                        )
                );
        response.getWriter().flush();
    }
}
