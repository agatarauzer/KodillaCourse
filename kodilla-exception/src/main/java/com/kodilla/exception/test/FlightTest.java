package com.kodilla.exception.test;

public class FlightTest {
    public static void main(String[] args) {
        FlightSearch search = new FlightSearch();

        try {
           search.findFlight(new Flight("Warsaw", "London"));
        }
        catch (RouteNotFoundException e) {
           System.out.println("Destination airport doesn't exist! Try again");
        }
    }
}
