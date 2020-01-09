package com.mdevi.northwind.model.repository.impl;

import com.mdevi.northwind.model.Customer;
import com.mdevi.northwind.model.repository.CustomerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private final SessionFactory sessionFactory;

    private static final Logger logger = LogManager.getLogger(CustomerRepository.class);

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
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
    }

    public List<Customer> getAllCustomers() {
        @SuppressWarnings("unchecked")
        TypedQuery<Customer> queryList = sessionFactory.getCurrentSession().createQuery("from Customer");
        return queryList.getResultList();
    }

    @Override
    public List<Customer> getCustomersByName(String customerName) {
        String HQL = "from Customer where companyname = :name";
        @SuppressWarnings("unchecked")
        TypedQuery<Customer> queryList = sessionFactory.getCurrentSession().createQuery(HQL).setParameter("name", customerName);
        //logger.info("getCustomerByName HQL string: " + HQL );
        return queryList.getResultList();
    }

    @Override
    public List<Customer> getCustomersByFilter(Map<String, List<String>> filters) {

        StringJoiner sjOR = new StringJoiner(" OR ");
        for (Map.Entry<String, List<String>> stringEntry : filters.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(stringEntry.getKey()).append(" IN ( ");
            StringJoiner sjComma = new StringJoiner(", ");
            for (String s : stringEntry.getValue()) {
                sjComma.add(s);
            }
            sb.append(sjComma.toString());
            sb.append(" )");
            sjOR.add(sb.toString());
        }
        String HQL = "from Customer where " + sjOR.toString();
        try {
            @SuppressWarnings("unchecked")
            TypedQuery<Customer> queryList = sessionFactory.getCurrentSession().createQuery(HQL);
            return queryList.getResultList();
        } catch (Exception e) {
            logger.info(e.getMessage());
            return null;
        }
    }

    @Override
    public void deleteCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(customer);
    }
}
