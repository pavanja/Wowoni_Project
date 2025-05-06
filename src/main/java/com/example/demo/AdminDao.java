package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDao implements AdminServices
{
   @Autowired
	AdminRepo AR;
	
	@Override
	public Admin checkadmin(String name, String pass) {
		// TODO Auto-generated method stub
		return AR.findByAdminNameAndAdminPassword(name, pass);
	}

}
