package com.mdevi.northwind.model.repository.impl;

import com.mdevi.northwind.model.Employee;
import com.mdevi.northwind.model.repository.EmployeeRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public List<Employee> getList() {
        @SuppressWarnings("unchecked")
        TypedQuery<Employee> queryList = sessionFactory.getCurrentSession().createQuery("from Employee");
        return queryList.getResultList();
    }
}
