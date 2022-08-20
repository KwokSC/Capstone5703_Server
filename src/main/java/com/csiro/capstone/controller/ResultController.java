package com.csiro.capstone.controller;

import com.csiro.capstone.common.ResponseObject;
import com.csiro.capstone.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @RequestMapping("/getResult")
    public ResponseObject getResult(String id){
        return resultService.getResult(id);
    }

}
