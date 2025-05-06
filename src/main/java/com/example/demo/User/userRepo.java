package com.example.demo.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<users, Integer> 
{
	
   public users findByUserNameAndUserPassword(String user, String pass);
}
