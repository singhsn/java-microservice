package com.example.microservice.controller;

//import com.example.microservice.entity.Customer;
import com.example.microservice.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<String> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/health")
    public String health() {
        return "SUCCESS";
    }


  /*  @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }*/
}
