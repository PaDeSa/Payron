package com.dsp.gl.commons;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AbstractController {


    public <T> ResponseEntity<ApiResponse<T>> getResponseEntity(T response) {
        ApiResponse<T> responseDTO = ApiResponse
                .<T>builder()
                .status(Status.SUCCESS)
                .data(response)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
