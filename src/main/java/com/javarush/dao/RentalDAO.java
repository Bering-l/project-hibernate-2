package com.javarush.dao;

import com.javarush.domain.Rental;
import org.hibernate.SessionFactory;

public class RentalDAO extends GenericDAO<Rental> {
    public RentalDAO(Class<Rental> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
