
package com.mycompany.wsclient_flight;

import java.net.MalformedURLException;
import java.net.URL;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SearchWS", targetNamespace = "http://ws.flights.mycompany.com/", wsdlLocation = "http://localhost:8080/SearchWS?wsdl")
@HandlerChain(file = "SearchWS_Service_handler.xml")
public class SearchWS_Service
    extends Service
{

    private final static URL SEARCHWS_WSDL_LOCATION;
    private final static WebServiceException SEARCHWS_EXCEPTION;
    private final static QName SEARCHWS_QNAME = new QName("http://ws.flights.mycompany.com/", "SearchWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SearchWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SEARCHWS_WSDL_LOCATION = url;
        SEARCHWS_EXCEPTION = e;
    }

    public SearchWS_Service() {
        super(__getWsdlLocation(), SEARCHWS_QNAME);
    }

    public SearchWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SEARCHWS_QNAME, features);
    }

    public SearchWS_Service(URL wsdlLocation) {
        super(wsdlLocation, SEARCHWS_QNAME);
    }

    public SearchWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SEARCHWS_QNAME, features);
    }

    public SearchWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SearchWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SearchWS
     */
    @WebEndpoint(name = "SearchWSPort")
    public SearchWS getSearchWSPort() {
        return super.getPort(new QName("http://ws.flights.mycompany.com/", "SearchWSPort"), SearchWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchWS
     */
    @WebEndpoint(name = "SearchWSPort")
    public SearchWS getSearchWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.flights.mycompany.com/", "SearchWSPort"), SearchWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SEARCHWS_EXCEPTION!= null) {
            throw SEARCHWS_EXCEPTION;
        }
        return SEARCHWS_WSDL_LOCATION;
    }

}
