package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.exceptions.UserNotFoundException;
import com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();// Constructor logic if needed
        users.add(new User(1L, "John", "Doe"));
        users.add(new User(2L, "Jane", "Doe"));
        users.add(new User(3L, "Jim", "Beam"));
        users.add(new User(4L, "Jack", "Daniels"));
        users.add(new User(5L, "Johnny", "Walker"));
        users.add(new User(6L, "Jose", "Cuervo"));
        users.add(new User(7L, "Hendrick", "Gin"));
        users.add(new User(8L, "Gordon", "Ramsay"));

        
    }

    @Override
    public List<User> findAll() {
        return users; // Placeholder return
    }


    @Override
    public User findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        
        if (user == null) {
            throw new UserNotFoundException(id);
        }

        return user; // Placeholder return
    }

}
