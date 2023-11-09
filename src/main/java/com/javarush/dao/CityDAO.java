package com.javarush.dao;

import com.javarush.domain.City;
import org.hibernate.SessionFactory;

public class CityDAO extends GenericDAO<City> {
    public CityDAO(Class<City> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
