package com.mdevi.northwind.model.repository.impl;

import com.mdevi.northwind.model.Customer;
import com.mdevi.northwind.model.repository.CustomerRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        @SuppressWarnings("unchecked")
        TypedQuery<Customer> queryList = sessionFactory.getCurrentSession().createQuery("from Customer");
        return queryList.getResultList();
    }
}
