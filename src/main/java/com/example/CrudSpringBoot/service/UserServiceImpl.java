package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.dao.UserDao;
import com.example.CrudSpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getOne(id);
    }
}
