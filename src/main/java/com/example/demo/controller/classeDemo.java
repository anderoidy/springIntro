package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class classeDemo {

    @GetMapping("/")
    public String metodoExibeMensagem(){
        return "Hello Spring";
    }
}
