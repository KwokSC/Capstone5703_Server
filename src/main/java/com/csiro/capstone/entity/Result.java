package com.csiro.capstone.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Result {

    private String resultId;

    private Date uploadDate;

    private Boolean isPositive;

    private double reliability;
}
