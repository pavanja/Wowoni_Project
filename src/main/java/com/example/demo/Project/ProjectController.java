package com.example.demo.Project;

import java.util.UUID;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController 

{
	@Autowired
	ProjectDao PD;
	
	

	@PostMapping("/projectdetail")
	public String savedataproject(@ModelAttribute("p2") Project p2)
	{
		System.out.println(p2);
		p2.setProject_id(UUID.randomUUID().toString());
		PD.savetheproject(p2);
		return "redirect:/user";
		
		
	}
	
	
	
}
