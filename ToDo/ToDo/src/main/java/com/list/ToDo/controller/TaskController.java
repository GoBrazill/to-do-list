package com.list.ToDo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
	@PostMapping("/create/{userId}")
	public ResponseEntity<?> createTask(@PathVariable Long userId, @Valid @RequestBody TaskDTO dto) {
		
		return ResponseEntity.ok(taskService.createTask(userId, dto));
	}
	
	@GetMapping("/show/{id}")
	public ResponseEntity<?> showById(@PathVariable long id) {
		
		return ResponseEntity.ok(taskService.showTaskById(id));
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
