package com.mycompany.wsclient_flight.object;

import com.mycompany.wsclient_flight.ws.Place;

public class ExtPlace extends Place {

    public ExtPlace() {
    }
    
    public ExtPlace(Place place) {
        super.setBusy(place.isBusy());
        super.setFlightClass(place.getFlightClass());
        super.setId(place.getId());
        super.setSeatLetter(place.getSeatLetter());
        super.setSeatNumber(place.getSeatNumber());
    }
    
    @Override
    public String toString() {
        return seatLetter + seatNumber;
    }   
}
