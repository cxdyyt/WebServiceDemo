package com.interview.bank.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.interview.bank.jwt.InvalidTokenException;

@RestControllerAdvice
public class WebExceptionHandler {
    @ResponseBody
    @ExceptionHandler(InvalidTokenException.class)
    public Object handleException(Exception e) {
        return e.getMessage();
    }
}