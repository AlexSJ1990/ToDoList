package com.todo.todoList.repository;

import com.todo.todoList.domains.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository <List, Integer> {
}
