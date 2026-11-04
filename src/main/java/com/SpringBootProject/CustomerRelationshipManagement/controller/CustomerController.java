package com.SpringBootProject.CustomerRelationshipManagement.controller;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;
import com.SpringBootProject.CustomerRelationshipManagement.service.CustomerService;

@RestController 
@RequestMapping("/api/customers")
public class CustomerController {
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/insert")
    public String insertCustomer(@RequestBody Customer customer) {
        return customerService.insertCustomer(customer);
    }

}
