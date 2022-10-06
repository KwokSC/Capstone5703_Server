package com.csiro.capstone.mapper;

import com.csiro.capstone.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectByUserName(String userName);

    int addUser(User user);

}
