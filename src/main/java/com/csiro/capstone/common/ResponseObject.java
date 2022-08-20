package com.csiro.capstone.common;

import lombok.Data;

@Data
public class ResponseObject<T> {

    private T data;

    private int code;

    private String msg;

}
