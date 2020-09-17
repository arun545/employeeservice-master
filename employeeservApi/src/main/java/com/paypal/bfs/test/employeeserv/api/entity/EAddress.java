package com.paypal.bfs.test.employeeserv.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="EMP_ADDRESS")
public class EAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
