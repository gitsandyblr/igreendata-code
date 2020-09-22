package com.greendata.codechallenge.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiErrorResponse {

    private String errorMessage;
    private int errorCode;
}
