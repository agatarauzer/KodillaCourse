package com.kodilla.good.patterns.challenges.FlightSearch;

public class FlightWithStopover {
    private DirectFlight firstFlight;
    private DirectFlight secondFLight;


    public FlightWithStopover(DirectFlight firstFlight, DirectFlight secondFLight) {
        this.firstFlight = firstFlight;
        this.secondFLight = secondFLight;
    }

    public String toString() {
        return firstFlight + " " + secondFLight;
    }
}
