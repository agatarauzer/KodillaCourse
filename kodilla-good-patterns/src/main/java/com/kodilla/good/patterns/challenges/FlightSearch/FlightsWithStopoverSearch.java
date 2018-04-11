package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsWithStopoverSearch {
    private DirectFlightsBase flights;

    public FlightsWithStopoverSearch(DirectFlightsBase flights) {
        this.flights = flights;
    }

    public List<FlightWithStopover> searchNotDirectFlights(String departureAirport,
                                                           String destinationAirport,
                                                           String stopoverAirport) {

        List<DirectFlight> firstFlight = flights.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getDestinationAirport().equals(stopoverAirport))
                .collect(Collectors.toList());

        List<DirectFlight> secondFlight = flights.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(stopoverAirport))
                .filter(flight -> flight.getDestinationAirport().equals(destinationAirport))
                .collect(Collectors.toList());

        List<FlightWithStopover> flightsWithStopover = new ArrayList<>();
        for (DirectFlight flight1 : firstFlight) {
            for (DirectFlight flight2 : secondFlight) {
                FlightWithStopover flightWithStopover = new FlightWithStopover(flight1, flight2);
                flightsWithStopover.add(flightWithStopover);
            }
        }
        return flightsWithStopover;
    }

    public void printFlights(List<FlightWithStopover> flights) {
        for (FlightWithStopover flight : flights) {
            System.out.println(flight);
        }
    }

    public int getNumberOfFindedFlights(List<FlightWithStopover> flights) {
        return flights.size();
    }
}
