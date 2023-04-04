package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TodosEntity;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("api")
public class TodoController {
  @Autowired
  TodoService todoService;

  // get all
  @RequestMapping(value = "/todos", method = RequestMethod.GET)
  TodosEntity getTodos() {
    return todoService.getTodos();
  }

}
