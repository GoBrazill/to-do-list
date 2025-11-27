package com.list.ToDo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.list.ToDo.dto.TaskDTO;
import com.list.ToDo.entity.Task;
import com.list.ToDo.repository.TaskRepository;

@Service
public class TaskService {
	
	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public void createTask(TaskDTO dto) {
		Task task = new Task(dto);
		taskRepository.save(task);
	}

	public Optional<Task> showTaskById(long id) {
		
		return taskRepository.findById(id);
	}
	
	public List<Task> showAllTasks(){
		List<Task> tasks = taskRepository.findAll();
		List<Task> listTasks = new ArrayList<>();
		
		listTasks = tasks;
		
		return listTasks;
	}
	
	public String updateTask(long id, TaskDTO dto) {
		Optional<Task> taskList = taskRepository.findById(id);
		
		if (taskList.isPresent()) {
			Task task = taskList.get();
			task.setName(dto.getName());
			task.setDescription(dto.getDescription());
			task.setStatus(dto.getStatus());
			task.setStartDate(dto.getStartDate());
			task.setEndDate(dto.getEndDate());
			
			return task.toString();
		} else {
			return "Usuario não encontrado";
		}
		
	}
	
	public String deleteTaskById(long id) {
		if (taskRepository.findById(id) != null) {
			taskRepository.deleteById(id);
			
			return "Tarefa deletada com sucesso";
		}  else {
			return "Tarefa não encontrada";
		}
	}
}
