package com.csiro.capstone.controller;

import com.csiro.capstone.common.ResponseObject;
import com.csiro.capstone.entity.User;
import com.csiro.capstone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/signIn")
    public ResponseObject signIn(@RequestParam String userAccount, @RequestParam String userPassword){
        return userService.signIn(userAccount, userPassword);
    }

    @RequestMapping("/signUp")
    public ResponseObject signUp(@RequestBody User user){
        return userService.signUp(user);
    }
}
