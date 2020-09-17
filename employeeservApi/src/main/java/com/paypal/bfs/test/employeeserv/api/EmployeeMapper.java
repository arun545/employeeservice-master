package com.paypal.bfs.test.employeeserv.api;

import com.paypal.bfs.test.employeeserv.api.entity.EAddress;
import com.paypal.bfs.test.employeeserv.api.entity.EEmployee;
import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;

import java.util.function.Function;

public interface EmployeeMapper {
    Function<EEmployee,Employee> model=(EEmployee eEmployee)->{
        Employee employee=new Employee();
        employee.setId(eEmployee.getId());
        employee.setFirstName(eEmployee.getFname());
        employee.setLastName(eEmployee.getLname());
        employee.setAddress(fetchAddress(eEmployee.getAddress()));
        employee.setDateOfBirth(eEmployee.getDob());
        return employee;
    };
    Function<Employee,EEmployee> entity=(Employee employee)->{
        EEmployee e=new EEmployee();
        e.setId(employee.getId());
        e.setFname(employee.getFirstName());
        e.setLname(employee.getLastName());
        e.setDob(employee.getDateOfBirth());
        e.setAddress(fetchAddress(employee.getAddress()));
        return e;
    };

    static Address fetchAddress(EAddress eAddress) {
        Address address=new Address();
        address.setCity(eAddress.getCity());
        address.setCountry(eAddress.getCountry());
        address.setLine1(eAddress.getLine1());
        address.setLine2(eAddress.getLine2());
        address.setState(eAddress.getState());
        address.setZipcode(eAddress.getZipCode());
        return address;
    }
    static EAddress fetchAddress(Address address) {
        EAddress eAddress=new EAddress();
        eAddress.setCity(address.getCity());
        eAddress.setCountry(address.getCountry());
        eAddress.setLine1(address.getLine1());
        eAddress.setLine2(address.getLine2());
        eAddress.setState(address.getState());
        eAddress.setZipCode(address.getZipcode());
        return eAddress;
    }

}
