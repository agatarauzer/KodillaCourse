package FlightSearchTest;

import com.kodilla.good.patterns.challenges.FlightSearch.DirectFlight;
import com.kodilla.good.patterns.challenges.FlightSearch.DirectFlightsBase;
import com.kodilla.good.patterns.challenges.FlightSearch.DirectFlightsSearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DirectFlightsSearchTest {

    private DirectFlightsBase flightsBase;
    private DirectFlightsSearch flightsSearch;

    @Before
    public void createData() {
        flightsBase = new DirectFlightsBase();

        DirectFlight flight1 = new DirectFlight("Kraków", "Warszawa", "KA-1234");
        DirectFlight flight2 = new DirectFlight("Kraków", "Gdańsk", "KA-5678");
        DirectFlight flight3 = new DirectFlight("Warszawa", "Gdańsk", "WA-4593");
        DirectFlight flight4 = new DirectFlight("Warszawa", "Frankfurt", "WA-7897");
        DirectFlight flight5 = new DirectFlight("Kraków", "Warszawa", "KA-9999");

        flightsBase.addFlight(flight1);
        flightsBase.addFlight(flight2);
        flightsBase.addFlight(flight3);
        flightsBase.addFlight(flight4);
        flightsBase.addFlight(flight5);

        flightsSearch = new DirectFlightsSearch(flightsBase);
    }

    @Test
    public void testSearchAllFlightsFrom() {
        //Given
        String airport = "Kraków";

        //When
        List<DirectFlight> flightsFrom = flightsSearch.searchAllFlightsFrom(airport);
        int numberOfFlights = flightsSearch.getNumberOfFindedFlights(flightsFrom);

        //Then
        Assert.assertEquals(3,numberOfFlights);
    }

    @Test
    public void testSearchAllFlightsTo() {
        //Given
        String airport = "Warszawa";

        //When
        List<DirectFlight> flightsFrom = flightsSearch.searchAllFlightsTo(airport);
        int numberOfFlights = flightsSearch.getNumberOfFindedFlights(flightsFrom);

        //Then
        Assert.assertEquals(2, numberOfFlights);
    }

    @Test
    public void testSearchDirectFlightsByAirports() {
        //Given
        String departureAirport = "Warszawa";
        String destinationAirport = "Frankfurt";

        //When
        List<DirectFlight> flightsFromTo = flightsSearch.searchDirectFlightsByAirports(departureAirport, destinationAirport);
        int numberOfFlights = flightsSearch.getNumberOfFindedFlights(flightsFromTo);

        //Then
        Assert.assertEquals(1, numberOfFlights);
    }

    @Test
    public void testSearchDirectFlights() {
        //Given
        String departureAirport = "Warszawa";
        String destinationAirport = "Frankfurt";
        DirectFlight flight = new DirectFlight("Warszawa", "Frankfurt", "00");

        //When
        List<DirectFlight> flightsFromTo = flightsSearch.searchDirectFlights(flight);
        int numberOfFlights = flightsSearch.getNumberOfFindedFlights(flightsFromTo);

        //Then
        Assert.assertEquals(1, numberOfFlights);
    }

    @Test
    public void testNoFlightsFinded() {
        //Given
        String departureAirport = "Warszawa";
        String destinationAirport = "Berlin";

        //When
        List<DirectFlight> flightsFromTo = flightsSearch.searchDirectFlightsByAirports(departureAirport, destinationAirport);
        int numberOfFlights = flightsSearch.getNumberOfFindedFlights(flightsFromTo);

        //Then
        Assert.assertEquals(0, numberOfFlights);
    }
}
