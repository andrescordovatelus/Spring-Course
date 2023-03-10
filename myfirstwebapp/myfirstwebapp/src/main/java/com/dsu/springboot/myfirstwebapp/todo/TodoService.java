package com.dsu.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "andres", "Learn Typescript", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "andres", "Learn Nest", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "andres", "Learn Mockito Test", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUserName(String username){
        return todos;
    }
}
