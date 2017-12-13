package com.mdevi.northwind.service;

import com.mdevi.northwind.model.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Employee employee);

    List<Employee> getList();
}
