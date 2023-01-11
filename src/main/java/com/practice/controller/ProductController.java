package com.practice.controller;

import com.practice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/save")
    public void save(){
        service.saveProduct();
    }
    @GetMapping("/save1")
    public void save1() throws Exception {
        service.saveProductByThrowingCheckedException();
    }
}
