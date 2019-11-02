package com.todo.todoList.domains;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="todolist")
public class ToDoList {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String status;

    @Column(name="date_created")
    private Instant dateCreated;
}
