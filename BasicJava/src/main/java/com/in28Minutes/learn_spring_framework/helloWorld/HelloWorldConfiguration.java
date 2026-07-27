package com.in28Minutes.learn_spring_framework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) { };

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
        return new Person("Ravi", 25, new Address("Main Street", "Utrech"));
    }
    //Auto-wiring using method calls
    // using already created beans in a new bean as method calls
    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(), address());
    }
    // Auto-wiring using parameters
    @Bean
    public Person person3Parameter(String name, int age, Address address3){
        return new Person(name,age, address3);
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("KK501 ST", "Kigali");
    }

    @Bean(name = "address3") // creating custom names for beans
    public Address address3(){
        return new Address("sonatube", "Kicukiro");
    }



}

