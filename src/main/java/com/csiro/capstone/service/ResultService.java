package com.csiro.capstone.service;

import com.csiro.capstone.common.ResponseObject;
import com.csiro.capstone.entity.Result;

public interface ResultService {

    ResponseObject uploadPic();

    Result calculateResult();

    ResponseObject getResult(String id);

}
