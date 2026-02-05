package com.list.ToDo.service;

import org.springframework.stereotype.Service;

import com.list.ToDo.dto.UserDTO;
import com.list.ToDo.entity.User;
import com.list.ToDo.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public Optional<User> showUserById(long id) {

		return userRepository.findById(id);
	}

	public List<User> showAllUsers() {
		List<User> users = userRepository.findAll();
		List<User> listUsers = new ArrayList<>();

		listUsers = users;

		return listUsers;
	}

	public String updateUser(long id, UserDTO dto) {
		Optional<User> userList = userRepository.findById(id);

		if (userList.isPresent()) {
			User user = userList.get();
			user.setNome(dto.getName());
			user.setEmail(dto.getEmail());

			return user.toString();
		} else {
			return "Usuario não encontrado";
		}

	}

	public String deleteUserById(long id) {
		if(userRepository.findById(id) != null) {
			userRepository.deleteById(id);

			return "Usuario Deletado";
		} else {
			return "Usuário não encontrado";
		}
	}
}
