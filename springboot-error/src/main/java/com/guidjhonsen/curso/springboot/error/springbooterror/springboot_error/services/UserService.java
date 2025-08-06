package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.services;

import java.util.List;

import com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.models.domain.User;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
}
