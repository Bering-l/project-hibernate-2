package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "movie", name = "address")
@Getter
@Setter
public class Address extends LastUpdate {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String address;
    private String address2;
    private String district;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "postal_code")
    private String postalCode;

    private String phone;

/*    @Column(name = "location")
    private Geometry location;*/
}
