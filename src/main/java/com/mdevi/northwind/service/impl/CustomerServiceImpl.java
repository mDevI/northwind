package com.mdevi.northwind.service.impl;

import com.mdevi.northwind.model.Customer;
import com.mdevi.northwind.model.repository.CustomerRepository;
import com.mdevi.northwind.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional(readOnly = true)
    public Customer getCustomerById(String id) {
        return customerRepository.getCustomerById(id);
    }

    @Transactional
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Transactional(readOnly = true)
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Transactional(readOnly = true)
    public List<Customer> getCustomersByName(String customerName) {
        return customerRepository.getCustomersByName(customerName);
    }

    @Transactional(readOnly = true)
    public List<Customer> getCustomersByFilter(Map<String, List<String>> filters) {
        return customerRepository.getCustomersByFilter(filters);
    }
}
