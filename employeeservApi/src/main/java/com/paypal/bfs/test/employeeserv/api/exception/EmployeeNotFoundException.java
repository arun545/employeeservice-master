package com.paypal.bfs.test.employeeserv.api.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class EmployeeNotFoundException extends BaseException {
    public EmployeeNotFoundException(String errorMessage, HttpStatus statusCode) {
        super(errorMessage, statusCode);
    }
}
