package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer>
{
	
	public Admin findByAdminNameAndAdminPassword(String name, String password);

}
