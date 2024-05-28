package com.example.demo.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Tasks;
import com.example.demo.ifaces.TasksRepository;

@Service
public class TasksService {

	
	private TasksRepository repo;
	
	//repo will be injected
	public TasksService(TasksRepository repo) {
		super();
		this.repo=repo;
	}
	
	public Tasks save(Tasks entity) {
		return this.repo.save(entity);
	}
	public List<Tasks> findAll() {
		return this.repo.findAll();
	}
	
	public Tasks findById(Integer id) {
//		return this.repo.findById(id).isEmpty();
		return this.repo.findById(id)
				.orElseThrow(()->new RuntimeException
						("Element with given Id not found "+id));
		
		
	}
	

public void deleteById(Integer id) {
	
	Tasks elementById = null;
	if(this.repo.existsById(id)) {
		 elementById =this.findById(id);
	
	 this.repo.deleteById(id);
}}

public Tasks update(Tasks tasks) {
	return this.repo.saveAndFlush(tasks);
}
public Map<String,String> getTaskAndAssigne(){
	
	Map<String,String> data=new HashMap();
	List<Tasks> DataList=this.repo.findAll();
	for(Tasks task:DataList) {
		data.put(task.getTask(),task.getAssignedTo());
	}
	//return data;
	return this.repo.findAll().stream()
			.collect(Collectors.toMap(Tasks::getTask, Tasks::getAssignedTo));
}

}
