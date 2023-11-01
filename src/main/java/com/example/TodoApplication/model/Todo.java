package com.example.TodoApplication.model;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="todo")
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Nonnull
	private long id;
	
	@Column
	@Nonnull
	private String title;
	
	@Column	
	@Nonnull
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private Date date;
	
	@Column
	private String status;
	
	public Todo(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
