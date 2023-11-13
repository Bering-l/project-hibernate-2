package com.javarush.domain;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "movie", name = "language")
@Getter
@Setter
public class Language extends LastUpdate {

    @Id
    @Column(name = "language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;
    @Column(columnDefinition = "char")
    private String name;

}
