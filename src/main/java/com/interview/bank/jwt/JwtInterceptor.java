package com.interview.bank.jwt;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class JwtInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) {
        String token = httpServletRequest.getHeader("token");
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        if (handlerMethod.getBeanType().isAnnotationPresent(JwtToken.class) || method.isAnnotationPresent(JwtToken.class)) {

            JwtToken jwtToken = handlerMethod.getBeanType().getAnnotation(JwtToken.class);
            if (jwtToken == null) {
                jwtToken = method.getAnnotation(JwtToken.class);
            }
            if (jwtToken.required()) {
                if (token == null) {
                    throw new InvalidTokenException("Invalid token");
                }
                JwtGenerateAndValidate.checkSign(token);
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
            ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e)
            throws Exception {

    }
}
