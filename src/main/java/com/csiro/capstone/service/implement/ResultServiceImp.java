package com.csiro.capstone.service.implement;

import com.csiro.capstone.common.Constants;
import com.csiro.capstone.common.ResponseObject;
import com.csiro.capstone.entity.Result;
import com.csiro.capstone.service.ResultService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ResultServiceImp implements ResultService {

    // Implement function for clients to upload their pictures
    public ResponseObject uploadPic(){
        ResponseObject responseObject = new ResponseObject();
        return responseObject;
    }

    // Implement function for server to call to calculate results after receiving pictures
    public ResponseObject calculateResult(){
        ResponseObject responseObject = new ResponseObject();
        return responseObject;
    }

    // Implement function for server to return results after calculation completion
    public ResponseObject getResult(){
        ResponseObject responseObject = new ResponseObject();
        Result result = new Result();
        Date date = new Date();
        result.setIsPositive(true);
        result.setReliability(89.22);
        result.setResultId("");
        result.setUploadDate(date);
        responseObject.setCode(Constants.Code.NORMAL);
        responseObject.setMsg(Constants.Result.SUCCESS);
        responseObject.setData(result);
        return responseObject;
    }

}
