package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.exceptions.UserNotFoundException;
import com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.models.domain.User;
import com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping
    public String index() {
        int value = 100 / 0; // This will cause an ArithmeticException
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user = service.findById(id);
        if (user == null) {
            throw new UserNotFoundException(id);
        }
        return service.findById(id);
    }
}
