package com.list.ToDo.entity;

import java.time.LocalDate;

import com.list.ToDo.dto.TaskDTO;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 100)
	private String name;
	@Column(length = 500)
	private String description;
	private Status status;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Task() {
		
	}
	
	public Task(TaskDTO dto) {
		this.name = dto.getName();
		this.description = dto.getDescription();
		this.status = status.PENDING;
		this.startDate = LocalDate.now();
	}
	
	public Task(long id, String name, String description, Status status, LocalDate startDate, LocalDate endDate) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@ManyToOne
	@JoinColumn(name = "student_id")
	private User student;
	
}
