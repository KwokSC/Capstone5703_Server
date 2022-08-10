package com.csiro.capstone.common;

import lombok.Data;

@Data
public class ResponseObject {

    private Object data;

    private int code;

    private String msg;

}
