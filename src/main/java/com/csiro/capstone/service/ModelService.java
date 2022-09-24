package com.csiro.capstone.service;


import java.io.File;

public interface ModelService {

    boolean isLatest();

    File getModel();
}
