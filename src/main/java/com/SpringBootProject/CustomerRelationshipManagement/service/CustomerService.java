package com.SpringBootProject.CustomerRelationshipManagement.service;

import java.util.List;
import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {
    List<Customer> insertCustomer(List<Customer> customers);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
}
