package com.example.HelloWorldBasic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/Hello")
    public String HelloWorld()
    {
        return "helloworld";
    }
}
