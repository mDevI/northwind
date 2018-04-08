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
    private final SessionFactory sessionFactory;

    @Autowired
    public CustomerRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Customer getCustomerById(String id) {
        @SuppressWarnings("unchecked")
        TypedQuery<Customer> query = sessionFactory.getCurrentSession()
                .createQuery("from Customer where customerid = :id").setParameter("id", id);
        return query.getSingleResult();
    }

    public void save(Customer customer) {
//        sessionFactory.getCurrentSession().save(customer);
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
    }

    public List<Customer> getAllCustomers() {
        @SuppressWarnings("unchecked")
        TypedQuery<Customer> queryList = sessionFactory.getCurrentSession().createQuery("from Customer");
        return queryList.getResultList();
    }

    @Override
    public List<Customer> getCustomersByName(String customerName) {
        String HQL = "from Customer where companyname LIKE " + customerName + "%";
        @SuppressWarnings("unchecked")
        TypedQuery<Customer> queryList = sessionFactory.getCurrentSession().createQuery(HQL);
        return queryList.getResultList();
    }
}
