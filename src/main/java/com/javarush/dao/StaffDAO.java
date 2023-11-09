package com.javarush.dao;

import com.javarush.domain.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(Class<Staff> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
