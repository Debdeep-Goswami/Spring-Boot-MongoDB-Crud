package com.spring.mongo.demo.service.impl;

import com.spring.mongo.demo.model.User;
import com.spring.mongo.demo.repository.UserRepository;
import com.spring.mongo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(String id) {
        return repository.findById(id).orElse(new User());
    }

    @Override
    public User save(User User) {
        return repository.save(User);
    }

    @Override
    public User update(User User) {
        return repository.save(User);
    }

    @Override
    public void delete(String id) {
       repository.findById(id).ifPresent(User -> repository.delete(User));
    }
}
