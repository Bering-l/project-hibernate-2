package com.javarush.dao;

import com.javarush.domain.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(Class<Customer> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
