package com.csiro.capstone.service;

import com.csiro.capstone.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    // Register new users.
    boolean signUp(User user);

    // Check users' account and password.
    boolean signIn(String account, String password);

}
