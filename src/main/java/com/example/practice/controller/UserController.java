package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.models.User;
import com.example.practice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public User testQuery() {
        return userService.selectUserByName("Daisy");
    }

    @RequestMapping("/insert")
    public List<User> testInsert() {
        userService.insertService();
        return userService.selectAllUser();
    }


    @RequestMapping("/changemoney")
    public List<User> testchangemoney() {
        userService.changemoney();
        return userService.selectAllUser();
    }

    @RequestMapping("/delete")
    public User  testDelete() {
        userService.deleteService("Daisy");
        return userService.selectUserByName("Daisy");
    }
    @RequestMapping("/deleteAll")
    public String Alldelete() {
        userService.deleteAllService();
        return "OK";
    }
    @RequestMapping("/findAll")
    public List<User> findAll() {
      return  userService.findAllService();
       
    }
}