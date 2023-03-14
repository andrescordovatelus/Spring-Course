package com.dsu.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Andres", LocalDate.now().minusYears(25)));
        users.add(new User(2, "Carlos", LocalDate.now().minusYears(45)));
        users.add(new User(3, "Jorge", LocalDate.now().minusYears(37)));
    }

    public List<User> findAll(){
        return  users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id); 
        return users.stream().filter(predicate).findFirst().get();
    }
}
