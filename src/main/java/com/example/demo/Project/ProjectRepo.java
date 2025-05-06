package com.example.demo.Project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.UserProjectDTO;

@Repository
public interface ProjectRepo extends JpaRepository<Project, String>
{

	List<Project> findByUserid(String Userid);
	
	@Query("SELECT new com.example.demo.dto.UserProjectDTO(u.userName, p.project_id, p.project_name, p.project_lead, " +
		       "p.project_remark, p.project_checker_status, p.location, p.project_checker_remark, " +
		       "p.MakerStatus, p.maker_submit_date, p.checker_submit_date, p.userid, p.mangerid) " +
		       "FROM users u JOIN Project p ON u.user_id = CAST(p.userid AS int)")
		List<UserProjectDTO>fetchUserProjectDetails();
	
	
	List<Project> findByUserid(int userId);
	
	

	
//	List<Project> findByProject_Lead(String leadName);
}
