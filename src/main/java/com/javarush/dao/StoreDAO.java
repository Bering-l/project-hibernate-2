package com.javarush.dao;

import com.javarush.domain.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO(Class<Store> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
