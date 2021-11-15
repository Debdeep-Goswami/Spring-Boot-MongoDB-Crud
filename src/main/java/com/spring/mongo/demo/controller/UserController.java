package com.spring.mongo.demo.controller;


import com.spring.mongo.demo.model.User;
import com.spring.mongo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService UserService;

    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = UserService.findAll();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        User User = UserService.findById(id);
        return ResponseEntity.ok().body(User);
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody User User) {
        User savedUser = UserService.save(User);
        return ResponseEntity.ok().body(savedUser);
    }


    @PutMapping
    public ResponseEntity<?> update(@RequestBody User User) {
        User updatedUser = UserService.update(User);
        return ResponseEntity.ok().body(updatedUser);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        UserService.delete(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }
}
