package com.practice.controller;

import com.practice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionHandlerTestingController {

    @Autowired
    private ProductService service;
    @GetMapping("/getExcpt")
    public ResponseEntity<String> getException(){
        return new ResponseEntity<>(service.testException(), HttpStatus.OK);
    }

    @ExceptionHandler(value = NullPointerException.class)
    public String handleException(){
        return "Exception Occured, try agin";
    }
}
