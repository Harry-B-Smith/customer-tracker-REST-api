package com.highoctane.customertracker.service;

import com.highoctane.customertracker.model.Customer;
import com.highoctane.customertracker.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repo;


    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }
}
