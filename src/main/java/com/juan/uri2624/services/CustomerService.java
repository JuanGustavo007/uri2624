package com.juan.uri2624.services;

import com.juan.uri2624.dto.CustomersDto;
import com.juan.uri2624.entities.Customers;
import com.juan.uri2624.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public CustomersDto findCustomerById(Long id) {
        Customers customersDto = customerRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return new CustomersDto(customersDto);
    }


    @Transactional(readOnly = true)
    public Integer findCountCity(){
        Integer customerMinDto = customerRepository.searchCustomerCount();
        return customerMinDto;
    }

}
