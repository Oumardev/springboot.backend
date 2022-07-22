package com.oumardev.springstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ressource{
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}