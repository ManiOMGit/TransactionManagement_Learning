package com.practice.controller;

import com.practice.enums.EncodingPatternEnum;
import com.practice.factory.EncryptionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyDesignPatternDemoController {

    @Autowired
    private EncryptionFactory factory;
    @GetMapping("/encrypt")
    public void encryptWithEncoder(@RequestParam EncodingPatternEnum encodingPatternEnum){
        factory.findEncryption(encodingPatternEnum).getEncryptionType();
    }
}
