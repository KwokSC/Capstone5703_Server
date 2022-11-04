package com.csiro.capstone.service;

import com.csiro.capstone.common.Constants;
import com.csiro.capstone.common.ResponseObject;
import com.csiro.capstone.entity.User;
import com.csiro.capstone.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public ResponseObject signUp(User user) {
        ResponseObject responseObject = new ResponseObject();
        responseObject.setData(userMapper.addUser(user));
        responseObject.setCode(Constants.Code.NORMAL);
        responseObject.setMsg(Constants.Msg.SUCCESS);
        return responseObject;
    }

    public ResponseObject signIn(String userAccount, String password) {
        ResponseObject responseObject = new ResponseObject();
        User user = userMapper.selectByUserAccount(userAccount);
        if (password.equals(user.getUserPassword())){
            responseObject.setCode(Constants.Code.NORMAL);
            responseObject.setMsg(Constants.Msg.SUCCESS);
        }else {
            responseObject.setCode(Constants.Code.EXCEPTION);
            responseObject.setMsg(Constants.Msg.FAIL);
        }
        return responseObject;
    }
}
