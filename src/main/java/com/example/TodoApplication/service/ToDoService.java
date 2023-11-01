package com.example.TodoApplication.service;
import com.example.TodoApplication.Repository.ITodoRespo;
import com.example.TodoApplication.model.Todo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	@Autowired
	ITodoRespo repo;
	
	public List<Todo> getAllToDoItems(){
		 ArrayList<Todo> todoList = new ArrayList<>();
		 repo.findAll().forEach(todo -> todoList.add(todo));
		 
		 return todoList;
	}
	public Todo getToDoItemById(Long id){
		return repo.findById(id).get();
	}
	public boolean updateStatus(Long id) {
		Todo todo = getToDoItemById(id);
		todo.setStatus("Completed");
		
		return saveOrUpdateToDoItem(todo);
	} 
	public boolean saveOrUpdateToDoItem(Todo todo){
		Todo updatedObj = repo.save(todo);
		if(getToDoItemById(updatedObj.getId())!= null) {
		return true;
		}
		return false;
	}
	public boolean deleteToDoItem(Long id){
		repo.deleteById(id);
		if(repo.findById(id) == null) {
			return true;
		}
		return false;
	}
}
