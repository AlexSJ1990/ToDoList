package com.todo.todoList.domains;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="ListItem")
public class ListItem {
    @Id
    @GeneratedValue
    private int id;

    private String description;

    private String state;

    @Column(name="list_id")
    private int listId;

    @Column(name="date_created")
    private Instant dateCreated;

}