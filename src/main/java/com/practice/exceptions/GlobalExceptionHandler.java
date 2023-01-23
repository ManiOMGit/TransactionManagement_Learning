package com.practice.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = NullPointerException.class)
    public String handleException(){
        return " NullPointerExceptionException Occured, try agin";
    }
}
