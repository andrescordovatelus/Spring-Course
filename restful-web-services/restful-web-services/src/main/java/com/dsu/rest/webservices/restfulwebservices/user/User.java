package com.dsu.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
    private Integer id;
    @Size(min = 2, message = "Name should have at least 2 characters")
    @JsonProperty("user_name")
    private String name;
    @Past(message = "Birthdate should be in the past")
    @JsonProperty("birth_date")
    private LocalDate bithDate;

    public User(Integer id, String name, LocalDate bithDate) {
        this.id = id;
        this.name = name;
        this.bithDate = bithDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBithDate() {
        return bithDate;
    }

    public void setBithDate(LocalDate bithDate) {
        this.bithDate = bithDate;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", bithDate=" + bithDate + "]";
    }
}
