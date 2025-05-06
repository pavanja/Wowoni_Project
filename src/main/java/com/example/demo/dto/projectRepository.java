package com.example.demo.dto;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Project.Project;

public interface projectRepository 
{
	@Query("SELECT new com.example.demo.dto.UserProjectDTO(" +
		       "u.name,p.id, p.name, p.lead, p.remark, p.checkerStatus, " +
		       "p.location, p.checkerRemark, p.makerStatus, p.makerSubmitDate, " +
		       "p.checkerSubmitDate, u.id) " +
		       "FROM Project p JOIN p.user u")
	List<UserProjectDTO> fetchUserProjectDetails();
	
	@Query("SELECT new com.example.demo.dto.UserProjectDTO(" +
		       "u.name, p.id, p.name, p.lead, p.remark, p.checkerStatus, " +
		       "p.location, p.checkerRemark, p.makerStatus, p.makerSubmitDate, " +
		       "p.checkerSubmitDate, u.id) " +
		       "FROM Project p JOIN p.user u WHERE p.projectlead = :name")
		List<UserProjectDTO> findByProjectlead(@Param("name") String name);

}
