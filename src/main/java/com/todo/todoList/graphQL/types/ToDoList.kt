package com.todo.todoList.graphQL.types

import java.time.Instant

data class ToDoList(
    val id: Int,
    val name: String,
    val status: String,
    val dateCreated: Instant
)
