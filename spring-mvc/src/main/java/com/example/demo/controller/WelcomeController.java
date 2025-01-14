package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Tasks;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.TasksService;


@Controller
public class WelcomeController {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private TasksService tasksService;
	
	@Autowired
	private Tasks tasks;
	
	@Autowired
	private ModelAndView mdl;
	
	@GetMapping(path="/tasks")
	public String getTasks(
			Model model) {
		List<Tasks> list =tasksService.findAll();
		
		model.addAttribute("list",  list);
		return "showtask";
		}
	
	
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("index", "Blood Bank");
		return "index";
	}
	@RequestMapping(path="/employees",method=RequestMethod.GET)
	public String getEmployess(Model model) {
       List<String> list = service.getData("hr");
	       model.addAttribute("list",list);
	       return "showemployee";
}
	@GetMapping(path="/srchempbydept")
	public String findByDepartment(@RequestParam("dept")String dept,Model model) {
		
			List<String> list = service.getData("dept");
			model.addAttribute("list",list);
			return "showemployee";
		
	}
	
	@GetMapping(path="/srchemp")
	public String initSearch(Model model) {
		model.addAttribute("index", "Blood Bank");
		return "searchemployee";
		
	}
	
	
	@GetMapping(path="/addtask")
	public ModelAndView inintTaskPage() {
		mdl.addObject("command",tasks);
		
		mdl.setViewName("addtask");
		return mdl;
	
	}
	
	@PostMapping(path="/tasks")
	public String addTasks(Model model,@ModelAttribute Tasks entity) {
		
		Tasks response = tasksService.save(entity);
		
		return "success";
		
	}
	

}

