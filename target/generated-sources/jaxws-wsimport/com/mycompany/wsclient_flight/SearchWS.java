
package com.mycompany.wsclient_flight;

import java.util.List;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchWS", targetNamespace = "http://ws.flights.mycompany.com/")
@HandlerChain(file = "SearchWS_handler.xml")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SearchWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.wsclient_flight.City>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCities", targetNamespace = "http://ws.flights.mycompany.com/", className = "com.mycompany.wsclient_flight.GetAllCities")
    @ResponseWrapper(localName = "getAllCitiesResponse", targetNamespace = "http://ws.flights.mycompany.com/", className = "com.mycompany.wsclient_flight.GetAllCitiesResponse")
    @Action(input = "http://ws.flights.mycompany.com/SearchWS/getAllCitiesRequest", output = "http://ws.flights.mycompany.com/SearchWS/getAllCitiesResponse")
    public List<City> getAllCities();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buyTicket", targetNamespace = "http://ws.flights.mycompany.com/", className = "com.mycompany.wsclient_flight.BuyTicket")
    @ResponseWrapper(localName = "buyTicketResponse", targetNamespace = "http://ws.flights.mycompany.com/", className = "com.mycompany.wsclient_flight.BuyTicketResponse")
    @Action(input = "http://ws.flights.mycompany.com/SearchWS/buyTicketRequest", output = "http://ws.flights.mycompany.com/SearchWS/buyTicketResponse")
    public boolean buyTicket(
        @WebParam(name = "arg0", targetNamespace = "")
        Flight arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Place arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Passenger arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.mycompany.wsclient_flight.Flight>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchFlight", targetNamespace = "http://ws.flights.mycompany.com/", className = "com.mycompany.wsclient_flight.SearchFlight")
    @ResponseWrapper(localName = "searchFlightResponse", targetNamespace = "http://ws.flights.mycompany.com/", className = "com.mycompany.wsclient_flight.SearchFlightResponse")
    @Action(input = "http://ws.flights.mycompany.com/SearchWS/searchFlightRequest", output = "http://ws.flights.mycompany.com/SearchWS/searchFlightResponse")
    public List<Flight> searchFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        City arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        City arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.mycompany.wsclient_flight.Reservation
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkReservationByCode", targetNamespace = "http://ws.flights.mycompany.com/", className = "com.mycompany.wsclient_flight.CheckReservationByCode")
    @ResponseWrapper(localName = "checkReservationByCodeResponse", targetNamespace = "http://ws.flights.mycompany.com/", className = "com.mycompany.wsclient_flight.CheckReservationByCodeResponse")
    @Action(input = "http://ws.flights.mycompany.com/SearchWS/checkReservationByCodeRequest", output = "http://ws.flights.mycompany.com/SearchWS/checkReservationByCodeResponse")
    public Reservation checkReservationByCode(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
