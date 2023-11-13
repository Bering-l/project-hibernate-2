package com.javarush.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

@Entity
@Table(schema = "movie", name = "film")
@Getter
@Setter
public class Film extends LastUpdate {
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String title;
    @Column(columnDefinition = "text")
    @Type(type = "text")
    private String description;
    @Column(name = "release_year", columnDefinition = "year")
    @Convert(converter = YearAttributeConverter.class)
    private Year year;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "original_language_id")
    private Language originalLanguage;
    @Column(name = "rental_duration")
    private Byte rentalDuration;

    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    private Short length;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

    @Column(columnDefinition = "enum('G', 'PG', 'PG-13', 'R', 'NC-17')")
    @Convert(converter = RatingConverter.class)
    private Rating rating;

    @Column(name = "special_features",
            columnDefinition = "set('Trailers', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String specialFeatures;

    @ManyToMany
    @JoinTable(name = "film_category", joinColumns = @JoinColumn(name = "film_id",
            referencedColumnName = "film_id"), inverseJoinColumns = @JoinColumn(name = "category_id",
            referencedColumnName = "category_id"))
    private Set<Category> category;

    @ManyToMany
    @JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "film_id",
            referencedColumnName = "film_id"), inverseJoinColumns = @JoinColumn(name = "actor_id",
            referencedColumnName = "actor_id"))
    private List<Actor> actor;

    public Set<Feature> getFeatures() {
        Set<Feature> result = Stream.of(specialFeatures.split(",", -1))
                .map(Feature::getFeatureByValue)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
        return result;
    }

    public void setFeatures(Set<Feature> features) {
        if (isNull(features) || features.isEmpty()) {
            specialFeatures = null;
        } else {
            specialFeatures = features.stream()
                    .map(Feature::getValue)
                    .collect(Collectors.joining(","));
        }
    }
}
