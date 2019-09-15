package com.todo.todoList.controllers;

import com.todo.todoList.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ListController {

    private ListRepository repository;

    @Autowired
    public ListController(ListRepository repository) {
        this.repository = repository;
    }

    @GetMapping("_/lists")
    public List<com.todo.todoList.domains.List> findall() {
        return repository.findAll();
    }

    @GetMapping("_/lists/{list_id}")
    public Optional<com.todo.todoList.domains.List> findListById(@PathVariable Integer list_id) {
        return repository.findById(list_id);
    }
}
