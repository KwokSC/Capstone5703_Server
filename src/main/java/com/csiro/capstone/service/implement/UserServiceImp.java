package com.csiro.capstone.service.implement;

import com.csiro.capstone.common.Constants;
import com.csiro.capstone.common.ResponseObject;
import com.csiro.capstone.entity.User;
import com.csiro.capstone.mapper.UserMapper;
import com.csiro.capstone.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    UserMapper userMapper;

    @Override
    public ResponseObject signUp(User user) {
        ResponseObject responseObject = new ResponseObject();
        responseObject.setData(userMapper.addUser(user));
        responseObject.setCode(Constants.Code.NORMAL);
        responseObject.setMsg(Constants.Msg.SUCCESS);
        return responseObject;
    }

    @Override
    public ResponseObject signIn(String userName, String password) {
        ResponseObject responseObject = new ResponseObject();
        User user = userMapper.selectByUserName(userName);
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
