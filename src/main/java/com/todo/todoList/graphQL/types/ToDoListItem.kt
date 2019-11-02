package com.todo.todoList.graphQL.types

import java.time.Instant

data class ToDoListItem (
    val id: Int,
    val description: String,
    val status: String,
    val listId: Int,
    val dateCreated: Instant
)
