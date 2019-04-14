package com.apoorva.todoservice.controllers;

import com.apoorva.todoservice.models.Todo;
import com.apoorva.todoservice.repositories.TodoRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Todo createTodo(@Valid @RequestBody Todo todo){
        todo.set_id(ObjectId.get());
        todo.setCompleted(false);
        todoRepository.save(todo);

        return todo;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTodo(@PathVariable ObjectId id) {
        todoRepository.delete(todoRepository.findBy_id(id));
    }
}
