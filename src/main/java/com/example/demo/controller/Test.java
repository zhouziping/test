package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Value("${test}")
    private String test;
    @PostMapping("/test")
    public String test(){
        return test;
    }
}
