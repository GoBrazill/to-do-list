package com.list.ToDo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.list.ToDo.dto.UserDTO;
import com.list.ToDo.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("create")
	public ResponseEntity<?> createUser(@Valid @RequestBody UserDTO dto) {
		return ResponseEntity.ok(userService.createUser(dto));
	}

	@GetMapping("show/{id}")
	public ResponseEntity<?> showUserById(@Valid @RequestBody long id) {
		return ResponseEntity.ok(userService.showUserById(id));
	}

	@GetMapping("show/all")
	public ResponseEntity<?> showAllUsers() {
		return ResponseEntity.ok(userService.showAllUsers());
	}

	@PostMapping("update/{id}")
	public ResponseEntity<?> updateUser(@Valid @RequestBody long id, UserDTO dto) {
		return ResponseEntity.ok(userService.updateUser(id, dto));
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteUser(@Valid @RequestBody long id) {
		return ResponseEntity.ok(userService.deleteUserById(id));
	}
}
