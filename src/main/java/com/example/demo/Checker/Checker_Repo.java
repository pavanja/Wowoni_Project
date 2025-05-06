package com.example.demo.Checker;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Checker_Repo extends JpaRepository<Checker, Integer> 
{
	Checker findByCheckerNameAndCheckerPassword(String checkerName, String checkerPassword);

}
