package com.kodilla.exception.test;

public class Flight {
    private String departureAirport;
    private String arrivalAirPort;

    public Flight(String departureAirport, String arrivalAirPort) {
        this.departureAirport = departureAirport;
        this.arrivalAirPort = arrivalAirPort;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirPort() {
        return arrivalAirPort;
    }

    public static void main(String[] args) throws RouteNotFoundException {
        FindFlight find = new FindFlight();
        try {
            find.findFlight(new Flight("Warsaw", "Krakow"));
        } catch (Exception e) {
            throw new RouteNotFoundException();
        }
    }
}
