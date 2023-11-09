package com.javarush.dao;

import com.javarush.domain.Actor;
import org.hibernate.SessionFactory;


public class AddressDAO extends GenericDAO<Actor> {
    public AddressDAO(Class<Actor> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
