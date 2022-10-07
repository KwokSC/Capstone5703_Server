package com.csiro.capstone.mapper;

import com.csiro.capstone.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    User selectByUserAccount(String userAccount);

    int addUser(User user);

}
