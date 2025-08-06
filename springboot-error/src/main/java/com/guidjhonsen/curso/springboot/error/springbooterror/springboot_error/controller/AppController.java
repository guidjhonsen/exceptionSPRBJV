package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/app")
    public String index() {
        //int value = 100 / 0; // This will cause an ArithmeticException
        int value = Integer.parseInt("10x"); // This will cause a NumberFormatException
        
        System.out.println("value: " + value);
        
        return "ok 200";
    }
}
