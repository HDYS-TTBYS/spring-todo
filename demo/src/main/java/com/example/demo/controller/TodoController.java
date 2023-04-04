package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TodoEntity;
import com.example.demo.entity.TodosEntity;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("api")
public class TodoController {
  @Autowired
  TodoService todoService;

  // get all
  @RequestMapping(value = "/todos", method = RequestMethod.GET)
  public TodosEntity getTodos() {
    return todoService.getTodos();
  }

  // post
  @RequestMapping(value = "/todo", method = RequestMethod.POST)
  public TodoEntity createTodo(@RequestBody TodoEntity todo) {
    return todoService.createTodo(todo);
  }

  // put
  @RequestMapping(value = "/todo/{id}", method = RequestMethod.PUT)
  public TodoEntity updateTodo(@PathVariable(value = "id") int id, @RequestBody TodoEntity newTodo) {
    return todoService.updateTodo(id, newTodo);
  }

  // delete
  @RequestMapping(value = "/todo/{id}", method = RequestMethod.DELETE)
  public void deleteTodo(@PathVariable(value = "id") int id) {
    todoService.deleteTodo(id);
  }
}
