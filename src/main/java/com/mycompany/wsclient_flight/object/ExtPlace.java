package com.mycompany.wsclient_flight.object;

import com.mycompany.wsclient_flight.Place;

public class ExtPlace extends Place {
    @Override
    public String toString() {
        return seatLetter + String.valueOf(seatNumber);
    }   
}
