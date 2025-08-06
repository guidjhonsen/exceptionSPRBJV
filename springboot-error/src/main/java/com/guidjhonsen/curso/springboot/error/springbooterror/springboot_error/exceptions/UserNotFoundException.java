package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.exceptions;

public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(Long id) {
        super("User with ID " + id + " not found.");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

}
