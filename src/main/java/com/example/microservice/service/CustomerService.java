package com.example.microservice.service;

//import com.example.microservice.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    //private final CustomerRepository customerRepository;

//    public CustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    public List<String> getAllCustomers() {
        return new ArrayList<>();
    }

//    public Customer saveCustomer(Customer order) {
//        return customerRepository.save(order);
//    }
}
