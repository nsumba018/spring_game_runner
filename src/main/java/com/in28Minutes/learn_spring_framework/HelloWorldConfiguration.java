package com.in28Minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) { };

record Address(String street, String city) { }

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Nsumba";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 25);
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("KK501 ST", "Kigali");
    }
    //Auto-wiring using method calls
    // using already created beans in a new bean as method calls
    
    // Auto-wiring using parameters

}

