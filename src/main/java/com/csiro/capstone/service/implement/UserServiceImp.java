package com.csiro.capstone.service.implement;

import com.csiro.capstone.entity.User;
import com.csiro.capstone.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Override
    public boolean signUp(User user) {
        return false;
    }

    @Override
    public boolean signIn(String account, String password) {
        return false;
    }
}
