package com.SpringBootProject.CustomerRelationshipManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
