package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.models.domain;

public class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
