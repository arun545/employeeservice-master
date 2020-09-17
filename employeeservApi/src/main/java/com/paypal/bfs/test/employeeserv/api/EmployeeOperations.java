package com.paypal.bfs.test.employeeserv.api;

public interface EmployeeOperations<M,E> {
    public  M findById(Integer id);
    public  M create(M model);
}
