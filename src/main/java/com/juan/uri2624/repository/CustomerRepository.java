package com.juan.uri2624.repository;

import com.juan.uri2624.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customers, Long> {


    @Query(value = "select COUNT(obj.city) from Customers obj")
    Integer searchCustomerCount();
}
