package com.javarush.dao;

import com.javarush.domain.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDAO<Category> {
    public CategoryDAO(Class<Category> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
