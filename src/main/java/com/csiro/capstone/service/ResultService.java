package com.csiro.capstone.service;

import com.csiro.capstone.common.ResponseObject;

public interface ResultService {

    ResponseObject uploadPic();

    ResponseObject calculateResult();

    ResponseObject getResult();

}
