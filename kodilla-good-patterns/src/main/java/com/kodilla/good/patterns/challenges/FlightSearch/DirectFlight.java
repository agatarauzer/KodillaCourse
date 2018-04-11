package com.kodilla.good.patterns.challenges.FlightSearch;

import java.util.Objects;

public class DirectFlight {
    private String departureAirport;
    private String destinationAirport;
    private String flightNumber;

    public DirectFlight(String departureAirport, String destinationAirport, String flightNumber) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String toString() {
        return departureAirport + "-" + destinationAirport + " (" + flightNumber + ") ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectFlight flight = (DirectFlight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(destinationAirport, flight.destinationAirport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureAirport, destinationAirport);
    }
}
