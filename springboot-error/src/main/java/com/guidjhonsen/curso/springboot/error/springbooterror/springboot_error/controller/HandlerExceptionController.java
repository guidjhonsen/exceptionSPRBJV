package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<?> divisionByZero(Exception ex) {
       
        return ResponseEntity.internalServerError()
                .body("Error 500: " + ex.getMessage());
    }

}
