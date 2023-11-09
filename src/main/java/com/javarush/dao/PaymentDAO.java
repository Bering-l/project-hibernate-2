package com.javarush.dao;

import com.javarush.domain.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(Class<Payment> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
