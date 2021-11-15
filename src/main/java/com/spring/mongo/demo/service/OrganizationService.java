package com.spring.mongo.demo.service;

import com.spring.mongo.demo.model.User;

import java.util.List;

public interface OrganizationService {
    List<?> findAll();

    User findById(String id);

    User save(User User);

    User update(User User);

    void delete(String id);

}
