package com.paypal.bfs.test.employeeserv.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionMapper {
    /**
     * Handling Global exceptions which are not matched with below
     * @param exception
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> internalError(Exception exception){
        Error error=new Error(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
       return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * handling user defined exceptions
     * @param exception
     * @return
     */
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<Error> baseException(BaseException exception){
        Error error=new Error(exception.getMessage(), exception.getHttpStatus().getReasonPhrase());
        return new ResponseEntity<>(error,exception.getHttpStatus());
    }
}
