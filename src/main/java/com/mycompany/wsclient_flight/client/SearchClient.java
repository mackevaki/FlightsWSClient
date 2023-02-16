package com.mycompany.wsclient_flight.client;

import com.mycompany.wsclient_flight.ws.City;
import com.mycompany.wsclient_flight.ws.Flight;
import com.mycompany.wsclient_flight.ws.Passenger;
import com.mycompany.wsclient_flight.ws.Place;
import com.mycompany.wsclient_flight.ws.Reservation;
import com.mycompany.wsclient_flight.object.ExtCity;
import com.mycompany.wsclient_flight.rs.client.FlightsRS;
import com.mycompany.wsclient_flight.rs.objects.CityList;
import com.mycompany.wsclient_flight.ws.ArgumentException_Exception;
import com.mycompany.wsclient_flight.ws.FlightWS;
import com.mycompany.wsclient_flight.ws.FlightWS_Service;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchClient {
    private static SearchClient searchClient;
    
    private SearchClient() {
        searchService = new FlightWS_Service();
        searchWS = searchService.getFlightWSPort();
        cityClient = new FlightsRS();
    }
    
    public static SearchClient getInstance() {
        if (searchClient == null) {
            searchClient = new SearchClient();
        }
        return searchClient;
    }
    
    private final FlightWS_Service searchService;
    private final FlightWS searchWS;
    private FlightsRS cityClient;
    
    public ArrayList<ExtCity> getAllCities() {
        Response response = cityClient.findAllCities();
        List<City> list = response.readEntity(new GenericType<List<City>>(){});
        ArrayList<ExtCity> cityList = new ArrayList<>();
        
        for (City city : list) {
            ExtCity extCity = new ExtCity();
            extCity.setCode(city.getCode());
            extCity.setCountry(city.getCountry());
            extCity.setDesc(city.getDesc());
            extCity.setId(city.getId());
            extCity.setName(city.getName());
            cityList.add(extCity);
        }
        
        Collections.sort(cityList, (City t, City t1) -> t.getName().compareTo(t1.getName()));
        
        return cityList;
    }

    public ArrayList<Flight> searchFlight(long date, City cityFrom, City cityTo) throws ArgumentException_Exception{
        ArrayList<Flight> flightList = new ArrayList<>();      
        flightList.addAll(searchWS.searchFlight(date, cityFrom, cityTo));
        return flightList;
    }

    public boolean buyTicket(Flight flight, Place place, Passenger passenger, String addInfo) throws ArgumentException_Exception{
        return searchWS.buyTicket(flight, place, passenger, addInfo);
    }
    
    public Reservation checkReservationByCode(String code) throws ArgumentException_Exception{
        return searchWS.checkReservationByCode(code);
    }
}
