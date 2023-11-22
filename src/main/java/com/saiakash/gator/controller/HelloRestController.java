package com.saiakash.gator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping(path = "/get")
    public String get(){
        return "Hello World!";
    }
}
