package com.example.demo.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Project.ProjectDao;
import com.example.demo.Project.ProjectRepo;
import com.example.demo.dto.UserProjectDTO;
import com.example.demo.dto.projectRepository;
import com.example.demo.Admin;
import com.example.demo.AdminDao;
import com.example.demo.Checker.Checker;
import com.example.demo.Checker.Checker_Dao;
import com.example.demo.Project.Project;

@Controller
public class User_Controller 
{
	@Autowired
	AdminDao AD;
	
	@Autowired
	userdao u1;
	
	@Autowired
	Checker_Dao SH;
	
	@Autowired
	ProjectDao pd;
	

	@Autowired
	private ProjectRepo projectRepository;
	
	
	
	
	@GetMapping("/userlogin")
	public String loginuser()
	{
		return"login";
	}
	@PostMapping("/loginusercheck")
	public String authentication(@RequestParam("role") String role,
	                             @RequestParam("username") String username,
	                             @RequestParam("password") String password,
	                             Model model,
	                             HttpSession session) {

	    String userRole = "user";
	    String adminRole = "admin";
	    String checkerRole = "checker";

	    // USER login
	    if (userRole.equals(role)) {
	        users user = u1.checkLogin(username, password);
	        if (user != null) {
	            int id = user.getUser_id();
	            String userId = String.valueOf(id);
	            session.setAttribute("ID", userId);
	          List<Project> l1  =pd.projectinfo(userId);
	          System.out.println(l1);
	          model.addAttribute("temp", l1);
	            return "userdash";
	        }
	        return "redirect:/userlogin";	    }

	    // ADMIN login
	    else if (adminRole.equals(role)) {
	        Admin admin = AD.checkadmin(username, password);
	        System.out.println(admin);
	        if (admin != null) {
	        	 List<UserProjectDTO> data = projectRepository.fetchUserProjectDetails();
	     	    model.addAttribute("projects", data);
	            
	            
	            return "Admin";
	        }
	        return "redirect:/userlogin";	    }

	    // CHECKER login
	    else if (checkerRole.equals(role)) {
	      
                  
	        com.example.demo.Checker.Checker ch = SH.checkerlogin(username, password);
	        if (ch != null) {
	        	String name=ch.getCheckerName();
	        	
	            session.setAttribute("checker", name);
	            return "redirect:/checker";
	        }
	        System.out.println("Checker login failed for username: " + username);
	        return "redirect:/userlogin";
	    // Invalid role
	    
	    }
	    else
	    {
	    	 return "redirect:/userlogin";
	    }
	}

		
	
	@GetMapping("/reg")
	public String register() {
		return "/RegistrationUser";
		
	}
	
	@PostMapping("/register")
	public String Registration(@ModelAttribute("username") users Us) 
	{

		System.out.println(Us);
		u1.Registerall(Us);
		return "redirect:/userlogin";
	}
	
	@GetMapping("/formpage")
	public String projectform(Model M)
	{
		List<Checker> ck=SH.allinfo();
		M.addAttribute("checkerdata", ck);
	System.out.println(ck);
		return "formpage";
		
	}
	
	@GetMapping("/userdash")
	public String Userdashbord(HttpSession session,Model M )
	{
		int id = Integer.parseInt((String) session.getAttribute("ID")); // ✅ Safe conversion
		System.out.println(id);
		List<Project> pl=pd.projectinfo(id);
		M.addAttribute("temp", pl);
		return "redirect:/userdash";
		
	}
	
	@GetMapping("/Delete/{id}")
	public String Deleteproject(@PathVariable String id)
	{
		pd.DeleteProject(id);
		return "userdash";
		
	}
	
	@GetMapping("/Edit/{id}")
	public String projectedit(@PathVariable String id,Model M)
	{
		System.out.println(id);
		Project sd=pd.editdata(id);
		M.addAttribute("e", sd);
		System.out.println(sd);
		
		return "updateform";
		
	}
	
	@PostMapping("/updateprojectdata")
	public String updatedataproject(@ModelAttribute("PA") Project PA,Model M)
	{
		Project PO=new Project();
		PO.setProject_id(PA.getProject_id());
		PO.setProject_name(PA.getProject_name());
		PO.setLocation(PA.getLocation());
		PO.setMaker_submit_date(PA.getMaker_submit_date());
		PO.setProject_checker_status(PA.getProject_checker_status());
		PO.setProject_lead(PA.getProject_lead());
		PO.setMakerStatus(PA.getMakerStatus());
		PO.setUserid(PA.getUserid());
		PO.setProject_checker_remark(PA.getProject_checker_remark());
		PO.setProject_remark(PA.getProject_remark());
		
		PO.getChecker_submit_date(PA.getChecker_submit_date());
		
		pd.savetheproject(PO);
		String userID=PA.getUserid();
		List<Project> pl=pd.projectinfo(userID);
		M.addAttribute("temp", pl);
		return "userdash";
		
	}
	@PostMapping("/approveProject/{projectId}")
	public String approveProject(@PathVariable("projectId") String projectId,
	                             @RequestParam("userid") String id,
	                             Model M,
	                             HttpSession session) {
	    Optional<Project> optionalProject = pd.projectSingledata(projectId);
	    
	    if (optionalProject.isPresent()) {
	        Project project = optionalProject.get();
	        project.setMakerStatus("done");
	        pd.savetheproject(project);
	    } else {
	        // Log the error and optionally redirect or show a custom error page
	        System.err.println("Project not found for ID: " + projectId);
	        return "redirect:/user"; // Or handle more gracefully
	    }


	    return "redirect:/user";
	}

	@RequestMapping("/user")
	public String userdashbord(HttpSession session,Model M)
	{
		String id=(String) session.getAttribute("ID");
		System.out.println(id);
		 List<Project>  l1=pd.projectinfo(id);
	      M.addAttribute("temp", l1);
		return "userdash";
		
	}
	

	
	
	
	
	
	
	
	
	

	
}
