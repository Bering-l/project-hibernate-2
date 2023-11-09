package com.javarush.dao;

import org.hibernate.SessionFactory;

public class InventoryDAO extends GenericDAO<InventoryDAO> {
    public InventoryDAO(Class<InventoryDAO> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
