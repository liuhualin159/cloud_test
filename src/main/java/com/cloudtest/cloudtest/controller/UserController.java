package com.cloudtest.cloudtest.controller;

import com.cloudtest.cloudtest.model.User;
import com.cloudtest.cloudtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/getuser/{id}")
    public String getUser(@PathVariable String id) {
        User user = userService.findUserById(id);
        return user.toString();
    }
    @GetMapping("/getuser")
    public String getUser() {
        return "No User ID";
    }
}
