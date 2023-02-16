package com.mycompany.wsclient_flight.rs.client;

import jakarta.ws.rs.ClientErrorException;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class FlightsRS {
    private final WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/FlightsRS/resources/";

    public FlightsRS() {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public <T> T getAllCities(Class<T> responseType) throws ClientErrorException {
        return webTarget.path("flight/allcities").request(MediaType.APPLICATION_JSON).get(responseType);
    }

    public Response findAllCities() throws ClientErrorException {
        return webTarget.path("flight/allcities2").request(MediaType.APPLICATION_JSON).get();
    }

    public void close() {
        client.close();
    }
}
