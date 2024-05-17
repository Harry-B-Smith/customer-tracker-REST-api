package com.highoctane.customertracker.controller;

import com.highoctane.customertracker.model.Customer;
import com.highoctane.customertracker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService service;

    CustomerController(CustomerService customerService) {
        this.service = customerService;
    }

    @GetMapping("/list")
    public List<Customer> getAllCustomers () {

        return service.getAllCustomers();
    }
}
