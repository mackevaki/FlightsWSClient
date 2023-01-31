package com.mycompany.wsclient_flight.client;

import com.mycompany.flights.interfaces.impls.City;
import com.mycompany.flights.interfaces.impls.Flight;
import com.mycompany.flights.interfaces.impls.FlightService;
import com.mycompany.flights.interfaces.impls.SearchImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchClient {
    private static SearchClient searchClient;
    
    private SearchClient() {
        searchService = new FlightService();
        searchWS = searchService.getSearchImplPort();
    }
    
    public static SearchClient getInstance() {
        if (searchClient == null) {
            searchClient = new SearchClient();
        }

        return searchClient;
    }
    
    private final FlightService searchService;
    private final SearchImpl searchWS;
    
    
    public ArrayList<City> getAllCities() {
        ArrayList<City> cityList = new ArrayList<>();
        
        for (City city : searchWS.getAllCities()) {
            City extCity = new City();
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

}
