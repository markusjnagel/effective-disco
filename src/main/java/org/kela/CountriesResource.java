package org.kela;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/country")
public class CountriesResource {

    @Inject
    @RestClient
    CountriesService countriesService;


    @GET
    @Path("/name/{name}")
    public Set<Country> name(@PathParam("name") String name) {
        return countriesService.getByName(name);
    }
}