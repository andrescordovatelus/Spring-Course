package com.dsu.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "andres", "Learn Typescript", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "andres", "Learn Nest with TS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "andres", "Learn Mockito Test", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUserName(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targDate, boolean isdone) {
        Todo todo = new Todo(++todosCount, username, description, targDate, isdone);
        todos.add(todo);
    }

    public void deleteTodobyId(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf((predicate));
    }

    public Todo findByid(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteTodobyId(todo.getId());
        todos.add(todo);
    }
}
