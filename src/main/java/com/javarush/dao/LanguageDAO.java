package com.javarush.dao;

import com.javarush.domain.Language;
import org.hibernate.SessionFactory;

public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(Class<Language> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
