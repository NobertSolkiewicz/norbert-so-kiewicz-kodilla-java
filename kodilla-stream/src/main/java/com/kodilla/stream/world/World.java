package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return continents.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal bigDecimal = new BigDecimal("34223454643623214312");
        return bigDecimal;
    }
}
