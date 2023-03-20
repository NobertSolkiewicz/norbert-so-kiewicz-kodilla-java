package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Continent {

    private final Country country;
    private final BigDecimal peopleQuantity;

    public Continent(Country country, BigDecimal continentQuantity) {
        this.country = country;
        this.peopleQuantity = continentQuantity;
    }

    public Country getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity.multiply(country.getPeopleQuantity());
    }
}