package com.csiro.capstone.common;

public interface Constants {

    interface Picture{
        String SUCCESS = "Picture successfully received";
        String FAIL = "Failed to get picture";
    }

    interface Result{
        String SUCCESS = "Result successfully obtained";
        String FAIL = "Failed to get result";
    }

    interface Calculation{
        String SUCCESS = "Calculation completed";
        String FAIL = "Calculation failed";
    }

    interface Code{
        Integer NORMAL = 200;
        Integer EXCEPTION = 500;
    }

}
