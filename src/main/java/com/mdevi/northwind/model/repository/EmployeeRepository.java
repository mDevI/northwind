package com.mdevi.northwind.model.repository;

import com.mdevi.northwind.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    void save(Employee employee);

    List<Employee> getList();
}
