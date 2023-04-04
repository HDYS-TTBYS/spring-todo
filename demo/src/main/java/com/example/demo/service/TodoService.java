package com.example.demo.service;

import java.util.Date;
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
    System.out.println(new Date().getTime());
    return todos;
  }

  public TodoEntity createTodo(TodoEntity todo) {
    return todoRepository.save(todo);
  }

  public void deleteTodo(int id) {
    todoRepository.deleteById(id);
  }

  public TodoEntity updateTodo(int id, TodoEntity newTodo) {
    TodoEntity todo = todoRepository.findById(id).get();
    todo.setAssagin_person(newTodo.getAssagin_person());
    todo.setTitle(newTodo.getTitle());
    todo.setTodo_description(newTodo.getTodo_description());
    return todoRepository.save(todo);
  }
}
