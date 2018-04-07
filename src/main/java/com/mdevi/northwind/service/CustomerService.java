package com.mdevi.northwind.service;

import com.mdevi.northwind.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomerById(String id);

    void save(Customer customer);

    List<Customer> getAllCustomers();
}
