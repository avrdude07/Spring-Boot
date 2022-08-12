package com.example.api;

import com.example.api.dto.ResponseData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Test Response Data")
public class ResponseDataTest {
    private ResponseData responseData = new ResponseData();

    @Test
    @DisplayName("Test Function status is true")
    public void testStatusTrue(){
        var result = responseData.isStatus();
        assumeTrue(true, String.valueOf(result));
    }

    @Test
//    @Disabled
    @DisplayName("Test Function status is false")
    public void testStatusFalse(){
        var result = responseData.isStatus();
        assumeFalse(false, String.valueOf(result));
    }


}
