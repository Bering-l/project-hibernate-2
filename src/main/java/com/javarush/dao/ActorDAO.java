package com.javarush.dao;

import com.javarush.domain.Actor;
import com.javarush.domain.Address;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Address> {
    public ActorDAO(Class<Address> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
