package com.paypal.bfs.test.employeeserv.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="EMPLOYEE")
public class EEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fname;
    private String lname;
    private LocalDate dob;
    @OneToOne(targetEntity = EAddress.class,cascade = CascadeType.ALL)
    private EAddress address;
}
