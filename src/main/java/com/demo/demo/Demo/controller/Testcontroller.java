package com.demo.demo.Demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @RequestMapping(value = {"/test"},method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }
}
