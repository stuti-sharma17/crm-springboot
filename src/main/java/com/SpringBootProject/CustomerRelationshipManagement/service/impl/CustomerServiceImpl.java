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

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        Customer existing = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
        existing.setFirstName(customer.getFirstName());
        existing.setLastName(customer.getLastName());
        existing.setEmail(customer.getEmail());
        existing.setMobileNumber(customer.getMobileNumber());
        existing.setAge(customer.getAge());
        return customerRepository.save(existing);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
