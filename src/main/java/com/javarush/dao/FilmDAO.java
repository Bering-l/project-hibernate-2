package com.javarush.dao;

import com.javarush.domain.Film;
import org.hibernate.SessionFactory;

public class FilmDAO extends GenericDAO<Film> {
    public FilmDAO(Class<Film> clazz, SessionFactory sessionFactory) {
        super(clazz, sessionFactory);
    }
}
