package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "todo")
public class TodoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false)
  private String assagin_person;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String todo_description;

  @Column(nullable = true)
  private long created_at;

  @Column(nullable = true)
  private long updated_at;

  @PrePersist
  public void onPrePersist() {
    setCreated_at(new Date().getTime());
    setUpdated_at(new Date().getTime());
  }

  @PreUpdate
  public void onPreUpdate() {
    setUpdated_at(new Date().getTime());
  }
}
