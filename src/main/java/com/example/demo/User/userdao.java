package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userdao implements userServices
{

	@Autowired
	userRepo userepo;

	@Override
	public users checkLogin(String user, String pass) {
		// TODO Auto-generated method stub
		return userepo.findByUserNameAndUserPassword(user, pass);
	}

	@Override
	public users Registerall(users up) {
		return userepo.save(up);
	}

	
	

}
