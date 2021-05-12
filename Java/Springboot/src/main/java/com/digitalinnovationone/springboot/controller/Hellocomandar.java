package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocomandar {

    @GetMapping("/")
    public String helloMessage() {
        return "Hello, World";
    }
}
