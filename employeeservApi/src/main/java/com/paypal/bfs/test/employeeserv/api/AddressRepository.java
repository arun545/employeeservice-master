package com.paypal.bfs.test.employeeserv.api;

import com.paypal.bfs.test.employeeserv.api.entity.EAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<EAddress,Integer> {
}
