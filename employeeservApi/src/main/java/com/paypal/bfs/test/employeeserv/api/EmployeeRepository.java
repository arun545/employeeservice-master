package com.paypal.bfs.test.employeeserv.api;

import com.paypal.bfs.test.employeeserv.api.entity.EEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EEmployee,Integer> {
}
