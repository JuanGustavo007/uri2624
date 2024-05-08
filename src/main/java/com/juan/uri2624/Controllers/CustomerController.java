package com.juan.uri2624.Controllers;

import com.juan.uri2624.dto.CustomersDto;
import com.juan.uri2624.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/{id}")
    public CustomersDto getCustomersById(@PathVariable Long id) {
        CustomersDto customersDto = customerService.findCustomerById(id);
        return customersDto;
    }

    @GetMapping(value = "/count")
    public Integer getCustomersCount() {
        Integer customerMinDto = customerService.findCountCity();
        return customerMinDto;
    }
}
