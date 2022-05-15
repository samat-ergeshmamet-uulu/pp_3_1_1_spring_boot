package com.spring_boot.Dao;

import com.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();

    User show(Long id);

    void save(User user);

    void update(User updateUser);

    void deleteById(Long id);
}
