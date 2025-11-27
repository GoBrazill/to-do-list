package com.list.ToDo.controller;

import java.security.DrbgParameters.Reseed;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.list.ToDo.dto.TaskDTO;
import com.list.ToDo.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("task")
public class TaskController {
	
	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> createTask(@Valid @RequestBody TaskDTO dto) {
		taskService.createTask(dto);
		
		return ResponseEntity.ok("Tarefa criada com Sucesso");
	}
	
	@GetMapping("/show")
	public ResponseEntity<?> showById(@Valid @RequestBody TaskDTO dto) {
		
		return ResponseEntity.ok("");
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> updateTask(@Valid @RequestBody TaskDTO dto) {
		return ResponseEntity.ok("Tarefa atualizada com Sucesso");
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteTask(@Valid @RequestBody TaskDTO dto) {
		
		return ResponseEntity.ok("");
	}
}
