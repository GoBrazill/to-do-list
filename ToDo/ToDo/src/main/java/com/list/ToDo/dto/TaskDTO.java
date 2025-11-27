package com.list.ToDo.dto;

import java.time.LocalDate;

import com.list.ToDo.entity.Status;

import jakarta.validation.constraints.NotBlank;


public class TaskDTO {
	
	@NotBlank
	private String name;
	@NotBlank
	private String description;
	private Status status;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public TaskDTO(@NotBlank String name, @NotBlank String description, Status status, LocalDate startDate,
			LocalDate endDate) {
		this.name = name;
		this.description = description;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
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
	
	
}
