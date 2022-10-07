package com.csiro.capstone.service;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class ModelService{

    public boolean isLatest(){
        return true;
    }

    public File getModel(){
        return new File("");
    }

}
