package com.example.customer;

import org.springframework.web.bind.annotation.GetMapping;

public class CustomerController {
    @GetMapping
    Customer getCustomer() {
        return new Customer(1L, "James Bond");
    }
}
