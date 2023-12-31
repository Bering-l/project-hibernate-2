package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(schema = "movie", name = "store")
@Getter
@Setter
public class Store extends LastUpdate {
    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @OneToOne
    @JoinColumn(name = "manager_staff_id")
    private Staff staff;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
