package com.list.ToDo.service;

import org.springframework.stereotype.Service;

import com.list.ToDo.dto.UserDTO;
import com.list.ToDo.entity.User;
import com.list.ToDo.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserDTO createUser(UserDTO dto) {
		User user = new User(dto);
		userRepository.save(user);
		UserDTO userdto = new UserDTO(user.getName(), user.getEmail(), user.getPassword());
		return userdto;
	}
}
