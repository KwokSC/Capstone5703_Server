package com.csiro.capstone.service.implement;

import com.csiro.capstone.service.ModelService;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class ModelServiceImp implements ModelService {

    @Override
    public boolean isLatest(){
        return true;
    }

    @Override
    public File getModel(){
        return new File("");
    }

}
