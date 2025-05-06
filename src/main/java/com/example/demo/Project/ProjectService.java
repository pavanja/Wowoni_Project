package com.example.demo.Project;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.UserProjectDTO;

public interface ProjectService 
{

	public Project savetheproject(Project p2);
	
	public List<Project> projectinfo();
	public List<Project>projectinfo(int Userid);
	public List<Project>projectlead(String name);
	
	public Optional<Project> projectSingledata(String id);
	
	public void DeleteProject(String id);
	
	public Project editdata(String id);

	List<UserProjectDTO> getAllProjectsWithUsernamesfulljoin();

	List<Project> projectinfo(String Userid);


}


