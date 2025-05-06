package com.example.demo.Project;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserProjectDTO;

@Service
public class ProjectDao implements ProjectService
{
   
	@Autowired
	ProjectRepo PR;
	
	@Override
	public Project savetheproject(Project p2) {
		// TODO Auto-generated method stub
		
		
		return PR.save(p2);
	}

	@Override
	public List<Project> projectinfo() {
		// TODO Auto-generated method stub
		return PR.findAll();
	}

	@Override
	public List<Project> projectinfo(String Userid) {
		// TODO Auto-generated method stub
		return PR.findByUserid(Userid);
	}

	@Override
	public List<Project> projectlead(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Project> projectSingledata(String id) {
		// TODO Auto-generated method stub
		return PR.findById(id);
	}

	

	@Override
	public void DeleteProject(String id) {
		PR.deleteById(id);
		
	}

	@Override
	public Project editdata(String id) {
		// TODO Auto-generated method stub
		return PR.getById(id);
	}


	@Override
	public List<UserProjectDTO> getAllProjectsWithUsernamesfulljoin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> projectinfo(int Userid) {
		// TODO Auto-generated method stub
		return PR.findByUserid(Userid);
	}

	

	
	

	

	
	
}
