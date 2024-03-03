package com.week2.dblearn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "ID")
    private int customer_id;

    @Column(name = "NAME")
    private String customer_name;

    @Column(name = "ADDRESS")
    private String customer_address;
}
