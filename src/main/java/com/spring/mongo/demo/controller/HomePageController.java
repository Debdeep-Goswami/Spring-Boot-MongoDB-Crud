package com.spring.mongo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomePageController {

    @GetMapping("/")
    public String home(){
        return "This is the home page for this application";
    }

    @GetMapping("/debdeep")
    public String debdeep(){return "Hi, This is Debdeep";}

    @GetMapping("/shashwat")
    public String shashwat(){return "Shashwat was here";}

}
