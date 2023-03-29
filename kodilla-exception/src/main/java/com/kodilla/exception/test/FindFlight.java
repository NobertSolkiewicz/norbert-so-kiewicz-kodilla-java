package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        if (flights.containsKey(flight)) {
            flights.get(flight);
        } else throw new RouteNotFoundException();
    }
}
