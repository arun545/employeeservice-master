package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeOperations;
import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.entity.EEmployee;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for employee resource.
 */
@AllArgsConstructor
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
    private EmployeeOperations<Employee, EEmployee> employeeOperations;
    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {
        return new ResponseEntity<>(employeeOperations.findById(Integer.valueOf(id)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Employee> persistEmployee(Employee employee) {
        return new ResponseEntity<>(employeeOperations.create(employee),HttpStatus.CREATED);
    }
}
