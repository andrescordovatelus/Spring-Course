package com.springcourse.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){};
record Address (String firstline, String city){};

@Configuration
public class HelloWorldConfiguration {
    
    @Bean
    public String name(){
        return "Andres";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Eduardo", 19);
    }

    @Bean
    public Address address(){
        return new Address("chalatenango", "Chalatenango");
    }
}
