package com.practice.service;

import com.practice.model.Product;
import com.practice.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional
    public void saveProduct(){
        for(int i=0;i<10;i++){
            Product p=new Product();
            p.setName("name"+i);
            repository.save(p);
            if(i==7){
                throw new RuntimeException("something wrong");
            }
        }
    }
}
