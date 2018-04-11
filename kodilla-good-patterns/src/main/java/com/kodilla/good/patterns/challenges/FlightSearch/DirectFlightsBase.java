package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.ArrayList;
import java.util.List;

public class DirectFlightsBase {
    private List<DirectFlight> flights = new ArrayList<>();

    public void addFlight(DirectFlight flight) {
        flights.add(flight);
    }

    public void removeFLight(DirectFlight flight) {
        flights.remove(flight);
    }

    public List<DirectFlight> getFlights() {
        return flights;
    }
}
