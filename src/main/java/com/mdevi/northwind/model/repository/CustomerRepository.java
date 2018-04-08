package com.mdevi.northwind.model.repository;

import com.mdevi.northwind.model.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer getCustomerById(String id);

    void save(Customer customer);

    List<Customer> getAllCustomers();

    List<Customer> getCustomersByName(String customerName);
}
