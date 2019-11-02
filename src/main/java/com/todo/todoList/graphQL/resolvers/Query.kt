package com.todo.todoList.graphQL.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.todo.todoList.domains.ToDoList
import com.todo.todoList.repository.ListRepository
import org.springframework.beans.factory.annotation.Autowired
import java.util.*


class Query@Autowired constructor(private val listRepository: ListRepository): GraphQLQueryResolver {

    fun alToDolLists(): List<ToDoList> {
        return listRepository.findAll()
    }

    fun specificToDoList(id: Int): Optional<ToDoList> {
        return listRepository.findById(id)
    }
}