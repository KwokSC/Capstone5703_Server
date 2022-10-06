package com.csiro.capstone.service;

import com.csiro.capstone.common.ResponseObject;
import com.csiro.capstone.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    // Register new users.
    ResponseObject signUp(User user);

    // Check users' account and password.
    ResponseObject signIn(String account, String password);

}
