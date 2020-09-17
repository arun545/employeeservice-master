package com.paypal.bfs.test.employeeserv.api.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BaseException extends  RuntimeException{
    private String errorMessage;
    private HttpStatus httpStatus;
    public BaseException(String errorMessage,HttpStatus httpStatus){
        super(errorMessage);
        this.errorMessage=errorMessage;
        this.httpStatus=httpStatus;
    }
}
