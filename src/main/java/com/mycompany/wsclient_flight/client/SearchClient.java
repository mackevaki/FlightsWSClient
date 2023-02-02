package com.mycompany.wsclient_flight.client;

import com.mycompany.wsclient_flight.City;
import com.mycompany.wsclient_flight.Flight;
import com.mycompany.wsclient_flight.Passenger;
import com.mycompany.wsclient_flight.Place;
import com.mycompany.wsclient_flight.Reservation;
import com.mycompany.wsclient_flight.SearchWS;
import com.mycompany.wsclient_flight.SearchWS_Service;
import com.mycompany.wsclient_flight.object.ExtCity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchClient {
    private static SearchClient searchClient;
    
    private SearchClient() {
        searchService = new SearchWS_Service();
        searchWS = searchService.getSearchWSPort();
    }
    
    public static SearchClient getInstance() {
        if (searchClient == null) {
            searchClient = new SearchClient();
        }

        return searchClient;
    }
    
    private final SearchWS_Service searchService;
    private final SearchWS searchWS;
    
    
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
        flightList.addAll(searchWS.searchFlight(date, cityFrom, cityTo));
        return flightList;
    }

    public boolean buyTicket(Flight flight, Place place, Passenger passenger, String addInfo) {
        return searchWS.buyTicket(flight, place, passenger, addInfo);
    }
    
    public Reservation checkReservationByCode(String code) {
        return searchWS.checkReservationByCode(code);
    }
}
