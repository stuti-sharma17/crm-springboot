package com.SpringBootProject.CustomerRelationshipManagement.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;
import com.SpringBootProject.CustomerRelationshipManagement.repository.CustomerRepository;
import com.SpringBootProject.CustomerRelationshipManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public String insertCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Customer inserted successfully";
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
