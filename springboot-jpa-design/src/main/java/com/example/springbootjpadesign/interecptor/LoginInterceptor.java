package com.example.springbootjpadesign.interecptor;

import com.example.springbootjpadesign.component.EncryptComponent;
import com.example.springbootjpadesign.component.MyToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.handler.Handler;
import java.util.Optional;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private EncryptComponent encrypt;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Optional.ofNullable(request.getHeader(MyToken.AUTHORIZATION))
                .map(auth -> encrypt.decryptToken(auth))
                .ifPresentOrElse(token -> {
                    request.setAttribute(MyToken.UID, token.getUid());
                    request.setAttribute(MyToken.ROLE, token.getRole());
                }, () -> {
                    throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "未登录");
                });

        return true;
    }
}
