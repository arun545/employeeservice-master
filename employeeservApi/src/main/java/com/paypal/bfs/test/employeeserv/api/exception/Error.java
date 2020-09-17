package com.paypal.bfs.test.employeeserv.api.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Error {
    private String errorMessage;
    private String statusCode;
}
