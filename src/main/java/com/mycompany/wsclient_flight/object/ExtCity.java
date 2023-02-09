package com.mycompany.wsclient_flight.object;

import com.mycompany.wsclient_flight.ws.City;

public class ExtCity extends City{
    @Override
    public String toString() {
        return super.name;
    }
}
