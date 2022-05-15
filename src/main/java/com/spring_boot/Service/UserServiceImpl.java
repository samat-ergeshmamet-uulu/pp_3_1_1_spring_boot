package com.spring_boot.Service;

import com.spring_boot.Dao.UserDao;
import com.spring_boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public User show(Long id) {
        return userDao.show(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User updateUser) {
        userDao.update(updateUser);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }
}
