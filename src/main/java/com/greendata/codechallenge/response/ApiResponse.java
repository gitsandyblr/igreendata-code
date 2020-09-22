package com.greendata.codechallenge.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ApiSuccessResponse successResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ApiErrorResponse errorResponse;

}
