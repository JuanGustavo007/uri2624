package com.juan.uri2624.dto;

import com.juan.uri2624.entities.Customers;

public class CustomersDto {

    private Long id;
    private String name;
    private String street;
    private String city;
    private String state;
    private Double credit;

    public CustomersDto(Long id, String name, String street, String city, String state, Double credit) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.credit = credit;
    }

    public CustomersDto(Customers customers) {
        this.id = customers.getId();
        this.name = customers.getName();
        this.street = customers.getStreet();
        this.city = customers.getCity();
        this.state = customers.getState();
        this.credit = customers.getCredit();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Double getCredit() {
        return credit;
    }
}
