package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.model.User;

import java.util.List;

public interface UserService  {
    void add(User user);
    List<User> listUsers();
    void deleteById(Long id);
    User getUserById(long id);
}
