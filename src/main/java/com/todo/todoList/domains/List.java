package com.todo.todoList.domains;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="list")
public class List {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String status;

    @Column(name="date_created")
    private Instant dateCreated;
}
