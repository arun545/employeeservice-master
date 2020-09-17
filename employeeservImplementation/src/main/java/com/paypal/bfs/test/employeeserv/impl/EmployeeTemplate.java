package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeMapper;
import com.paypal.bfs.test.employeeserv.api.EmployeeOperations;
import com.paypal.bfs.test.employeeserv.api.EmployeeRepository;
import com.paypal.bfs.test.employeeserv.api.entity.EEmployee;
import com.paypal.bfs.test.employeeserv.api.exception.EmployeeNotFoundException;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeTemplate implements EmployeeOperations<Employee, EEmployee> {
    private final EmployeeRepository employeeRepository;
    @Override
    public Employee findById(Integer id) {
         Optional<EEmployee> entity=employeeRepository.findById(id);
         return entity.map(EmployeeMapper.model).orElseThrow(()->new EmployeeNotFoundException("Record not exist for the employeeId="+id, HttpStatus.NOT_FOUND));
    }

    @Override
    public Employee create(Employee model) {
        EEmployee entity=EmployeeMapper.entity.apply(model);
        return EmployeeMapper.model.apply(employeeRepository.save(entity));
    }


}
