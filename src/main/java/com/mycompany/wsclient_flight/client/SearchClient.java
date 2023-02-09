package com.mycompany.wsclient_flight.client;

import com.mycompany.wsclient_flight.ws.City;
import com.mycompany.wsclient_flight.ws.Flight;
import com.mycompany.wsclient_flight.ws.Passenger;
import com.mycompany.wsclient_flight.ws.Place;
import com.mycompany.wsclient_flight.ws.Reservation;
import com.mycompany.wsclient_flight.object.ExtCity;
import com.mycompany.wsclient_flight.ws.ArgumentException_Exception;
import com.mycompany.wsclient_flight.ws.CityEmptyException_Exception;
import com.mycompany.wsclient_flight.ws.FlightWS;
import com.mycompany.wsclient_flight.ws.FlightWS_Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchClient {
    private static SearchClient searchClient;
    
    private SearchClient() {
        searchService = new FlightWS_Service();
        searchWS = searchService.getFlightWSPort();
    }
    
    public static SearchClient getInstance() {
        if (searchClient == null) {
            searchClient = new SearchClient();
        }

        return searchClient;
    }
    
    private final FlightWS_Service searchService;
    private final FlightWS searchWS;
    
    
    public ArrayList<ExtCity> getAllCities() {
        ArrayList<ExtCity> cityList = new ArrayList<>();
        
        for (City city : searchWS.getAllCities()) {
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

    public ArrayList<Flight> searchFlight(long date, City cityFrom, City cityTo) {
        ArrayList<Flight> flightList = new ArrayList<>();      
        try {
            flightList.addAll(searchWS.searchFlight(date, cityFrom, cityTo));
        } catch (ArgumentException_Exception ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return flightList;
    }

    public boolean buyTicket(Flight flight, Place place, Passenger passenger, String addInfo) {
        try {
            return searchWS.buyTicket(flight, place, passenger, addInfo);
        } catch (ArgumentException_Exception ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Reservation checkReservationByCode(String code) {
        try {
            return searchWS.checkReservationByCode(code);
        } catch (ArgumentException_Exception ex) {
            Logger.getLogger(SearchClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
