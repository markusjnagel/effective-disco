package org.kela;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SayHello {

    public String hello (String name)
    {
        final String greeting = "Hello ";

        System.out.println(greeting + name);
        return (greeting + name);
    }

    
}
