package com.example.demo.Checker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Project.Project;
import com.example.demo.Project.ProjectDao;
import com.example.demo.Project.ProjectRepo;
import com.example.demo.User.users;
import com.example.demo.dto.UserProjectDTO;
import com.example.demo.dto.projectRepository;

@Controller
public class Checker_Controller 
{
	@Autowired
	Checker_Dao CD;
	
	@Autowired
	ProjectDao PS;
	
	@Autowired
	private ProjectRepo projectRepository;
	
	
	@GetMapping("/checker")
	public String getUserProjectInfo(Model model,HttpSession session) 
	{
	           String name        =   (String) session.getAttribute("checker");
	           System.out.println(name);
	    List<UserProjectDTO> data = projectRepository.fetchUserProjectDetails();
	    model.addAttribute("checkerdata", data);
	    System.out.println(data);
	    return "checkarview"; // Your JSP or HTML template
	}
	
	
	@GetMapping("/checkarview2/{project_id}")
	public String Checkerview2(@PathVariable("project_id") String project_id,Model M) {
	    System.out.println(project_id);
	    Optional<Project> sp=PS.projectSingledata(project_id);
	    System.out.println(sp);
	    M.addAttribute("temp", sp);
	    return "checkarview2";
	}
	
	
	@PostMapping("/updateproject")
	public String updateprojectrecord(@ModelAttribute("PW") Project PW,@RequestParam("projectId") String id) {
	    if (id == null) {
	        System.out.println("Project ID is null.");
	        return "errorPage"; // Or a relevant error page
	    }

	    // Rest of the code remains the same
	    Optional<Project> optionalProject = projectRepository.findById(id);

	    if (optionalProject.isPresent()) {
	        Project PO = optionalProject.get();
	        
	        // Update the project fields
	        PO.setProject_name(PW.getProject_name());
	        PO.setLocation(PW.getLocation());
	        PO.setMaker_submit_date(PW.getMaker_submit_date());
	        PO.setProject_checker_status(PW.getProject_checker_status());
	        PO.setProject_lead(PW.getProject_lead());
	        PO.setMakerStatus(PW.getMakerStatus());
	        PO.setUserid(PW.getUserid());
	        PO.setProject_checker_remark(PW.getProject_checker_remark());
	        PO.setProject_remark(PW.getProject_remark());

	        String dateString = LocalDate.now().toString();
	        PO.setChecker_submit_date(dateString);

	        projectRepository.save(PO);
	        
	        // Redirect after update
	        return "redirect:/checker";
	    } else {
	        // If no project is found
	        return null; // Redirect to an error page
	    }
	}

	

	
}
