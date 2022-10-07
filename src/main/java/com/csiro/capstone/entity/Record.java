package com.csiro.capstone.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Record {

    private int recordId;

    private Date recordDate;

    private String recordUser;

    private String recordResult;

}
