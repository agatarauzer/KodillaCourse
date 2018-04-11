package FlightSearchTest;

import com.kodilla.good.patterns.challenges.FlightSearch.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FlightsWithStopoverSearchTest {

    private DirectFlightsBase flightsBase;
    private FlightsWithStopoverSearch flightsSearch;

    @Before
    public void createData() {
        flightsBase = new DirectFlightsBase();

        DirectFlight flight1 = new DirectFlight("Kraków", "Warszawa", "KA-1234");
        DirectFlight flight2 = new DirectFlight("Kraków", "Gdańsk", "KA-5678");
        DirectFlight flight3 = new DirectFlight("Warszawa", "Gdańsk", "WA-4593");
        DirectFlight flight4 = new DirectFlight("Warszawa", "Gdańsk", "WA-7897");
        DirectFlight flight5 = new DirectFlight("Kraków", "Warszawa", "KA-9999");

        flightsBase.addFlight(flight1);
        flightsBase.addFlight(flight2);
        flightsBase.addFlight(flight3);
        flightsBase.addFlight(flight4);
        flightsBase.addFlight(flight5);

        flightsSearch = new FlightsWithStopoverSearch(flightsBase);
    }

    @Test
    public void testSearchNotDirectFlights() {
        //Given
        String departureAirport = "Kraków";
        String destinationAirport = "Gdańsk";
        String stopoverAirport = "Warszawa";

        //When
        List<FlightWithStopover> findedFlights = flightsSearch.searchNotDirectFlights(departureAirport, destinationAirport, stopoverAirport);
        int numberOfCombination = flightsSearch.getNumberOfFindedFlights(findedFlights);

        //Then
        Assert.assertEquals(4, numberOfCombination);
    }
}
