package com.example.CrudSpringBoot.dao;

import com.example.CrudSpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {}
