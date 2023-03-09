package com.dsu.springboot.learningspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn React", "Andres"),
                new Course(2, "Learn Mathematics", "Eduardo"),
                new Course(3, "Learn Java", "Javier"),
                new Course(4, "Learn JPA", "Jorge"));
    }
}
