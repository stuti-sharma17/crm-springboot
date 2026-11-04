package com.SpringBootProject.CustomerRelationshipManagement.service;

import java.util.List;
import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {
    String insertCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
}
