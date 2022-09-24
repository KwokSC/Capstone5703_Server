package com.csiro.capstone.controller;

import com.csiro.capstone.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")

public class ModelController {

    @Autowired
    private ModelService modelService;

}
