package org.kela;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;



import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@ApplicationScoped
public class Countries {
    
    @Inject
    @RestClient
    CountriesService countriesService;

    public String getCountry(String name) {
        Set<Country> returnedCountrySet;
        Country returnedCountry;
        
        returnedCountrySet = countriesService.getByName(name);
        returnedCountry = returnedCountrySet.iterator().next();
        System.out.println("Step 1: Hello " + returnedCountry.name + " your capital is " + returnedCountry.capital);

        return returnedCountry.name;
    }



}
