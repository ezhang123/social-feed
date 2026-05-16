package com.eric.socialfeed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.RestController;

//test file


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
