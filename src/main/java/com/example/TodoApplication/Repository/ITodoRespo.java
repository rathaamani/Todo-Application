package com.example.TodoApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TodoApplication.model.Todo;

@Repository
public interface ITodoRespo extends JpaRepository<Todo, Long>{

}
