
package com.mycompany.wsclient_flight.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CityEmptyException", targetNamespace = "http://ws.flights.mycompany.com/")
public class CityEmptyException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CityEmptyException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CityEmptyException_Exception(String message, CityEmptyException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CityEmptyException_Exception(String message, CityEmptyException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.mycompany.wsclient_flight.ws.CityEmptyException
     */
    public CityEmptyException getFaultInfo() {
        return faultInfo;
    }

}