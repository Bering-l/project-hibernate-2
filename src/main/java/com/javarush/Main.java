package com.javarush;

import com.javarush.dao.*;
import com.javarush.domain.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class Main {

    private final SessionFactory sessionFactory;

    private final ActorDAO actorDAO;

    private final AddressDAO addressDAO;
    private final CategoryDAO categoryDAO;
    private final CityDAO cityDAO;
    private final CustomerDAO customerDAO;
    private final FilmDAO filmDAO;
    private final FilmTextDAO filmTextDAO;
    private final InventoryDAO inventoryDAO;
    private final LanguageDAO languageDAO;
    private final PaymentDAO paymentDAO;
    private final RentalDAO rentalDAO;
    private final StaffDAO staffDAO;
    private final StoreDAO storeDAO;

    public Main(ActorDAO actorDAO, AddressDAO addressDAO, CategoryDAO categoryDAO,
                CityDAO cityDAO, CustomerDAO customerDAO, FilmDAO filmDAO, FilmTextDAO filmTextDAO,
                InventoryDAO inventoryDAO, LanguageDAO languageDAO, PaymentDAO paymentDAO,
                RentalDAO rentalDAO, StaffDAO staffDAO, StoreDAO storeDAO) {
        this.actorDAO = actorDAO;
        this.addressDAO = addressDAO;
        this.categoryDAO = categoryDAO;
        this.cityDAO = cityDAO;
        this.customerDAO = customerDAO;
        this.filmDAO = filmDAO;
        this.filmTextDAO = filmTextDAO;
        this.inventoryDAO = inventoryDAO;
        this.languageDAO = languageDAO;
        this.paymentDAO = paymentDAO;
        this.rentalDAO = rentalDAO;
        this.staffDAO = staffDAO;
        this.storeDAO = storeDAO;
        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        properties.put(Environment.DRIVER, "com.p6spy.engine.spy.P6SpyDriver");
        properties.put(Environment.URL, "jdbc:p6spy:mysql://localhost:3306/movie");
        properties.put(Environment.USER, "");
        properties.put(Environment.PASS, "");
        properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        properties.put(Environment.HBM2DDL_AUTO, "validate");

        sessionFactory = new Configuration()
                .addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Feature.class)
                .addAnnotatedClass(Film.class)
                .addAnnotatedClass(Inventory.class)
                .addAnnotatedClass(Language.class)
                .addAnnotatedClass(Payment.class)
                .addAnnotatedClass(Rating.class)
                .addAnnotatedClass(Staff.class)
                .addAnnotatedClass(Store.class)
                .addProperties(properties)
                .buildSessionFactory();
    }
}
