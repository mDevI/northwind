package com.mdevi.northwind.service.impl;

import com.mdevi.northwind.model.Employee;
import com.mdevi.northwind.model.repository.EmployeeRepository;
import com.mdevi.northwind.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getList() {
        return employeeRepository.getList();
    }
}
