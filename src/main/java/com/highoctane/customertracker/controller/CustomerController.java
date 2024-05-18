package com.highoctane.customertracker.controller;

import com.highoctane.customertracker.model.Customer;
import com.highoctane.customertracker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService service;

    CustomerController(CustomerService customerService) {
        this.service = customerService;
    }

    @GetMapping("/customers")
    public String getAllCustomers (Model model) {

        List<Customer> customers = service.getAllCustomers();

        model.addAttribute("customers", customers);

        return "customer-list";
    }
}
