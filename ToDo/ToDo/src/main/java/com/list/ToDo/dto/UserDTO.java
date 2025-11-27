package com.list.ToDo.dto;

import com.list.ToDo.entity.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDTO {
	
	@NotBlank(message = "Nome inválido")
	private String name;
	@NotBlank(message = "Email inválido") @Email
	private String email;
	@Size(min = 6, max = 20)
	private String password;
	
	public UserDTO() {
		super();
	}

	public UserDTO(User user) {
		this.name = user.getName();
		this.email = user.getEmail();
	}

	public UserDTO(@NotBlank(message = "Nome inválido") String name, @NotBlank(message = "Email inválido") String email,
			@Size(min = 6, max = 20) String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
