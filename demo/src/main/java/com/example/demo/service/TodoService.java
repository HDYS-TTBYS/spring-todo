package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.TodoRepository;
import com.example.demo.entity.TodoEntity;
import com.example.demo.entity.TodosEntity;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TodoService {
  @Autowired
  TodoRepository todoRepository;

  public TodosEntity getTodos() {
    long count = todoRepository.count();
    List<TodoEntity> list = todoRepository.findAll();
    TodosEntity todos = new TodosEntity(count, list);
    return todos;
  }
}
