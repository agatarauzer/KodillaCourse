package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.List;
import java.util.stream.Collectors;

public class DirectFlightsSearch {
    private DirectFlightsBase flights;

    public DirectFlightsSearch(DirectFlightsBase flights) {
        this.flights = flights;
    }

    public List<DirectFlight> searchAllFlightsFrom(String departureAirport) {
        return flights.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<DirectFlight> searchAllFlightsTo(String destinationAirport) {
        return flights.getFlights().stream()
                .filter(flight -> flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());
    }

    public List<DirectFlight> searchDirectFlightsByAirports(String departureAirport, String destinationAirport) {
        return flights.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());
    }

    public List<DirectFlight> searchDirectFlights(DirectFlight searchedFlight) {
        return flights.getFlights().stream()
                .filter(flight -> flight.equals(searchedFlight))
                .collect(Collectors.toList());
    }

    public void printFlights(List<DirectFlight> flights) {
        for (DirectFlight flight : flights) {
            System.out.println(flight);
        }
    }

    public int getNumberOfFindedFlights(List<DirectFlight> flights) {
        return flights.size();
    }
}
