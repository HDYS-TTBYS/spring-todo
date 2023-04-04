package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "todo")
public class TodoEntity {
  @Id
  @GeneratedValue
  private int id;

  @Column(nullable = false)
  private String assagin_person;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String todo_description;

  @Column(nullable = false)
  private int created_at;

  @Column(nullable = false)
  private int updated_at;
}
