package com.javarush.dao;

import com.javarush.domain.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(Actor, SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
