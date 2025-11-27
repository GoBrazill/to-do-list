package com.list.ToDo.entity;

import com.list.ToDo.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 100)
	private String name;
	@Column(length = 100, unique = true)
	private String email;
	@Column(length = 20)
	private String password;
	
	public User() {
		
	}
	
	public User(UserDTO dto) {
		this.name = dto.getName();
		this.email = dto.getEmail();
		this.password = dto.getPassword();
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
	public void setNome(String name) {
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
	public void setSenha(String password) {
		this.password = password;
	}
	
	
}
