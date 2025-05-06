package com.example.demo.Checker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Checker_Dao  implements Checker_Services{

	@Autowired
	Checker_Repo Cr;


	@Override
	public List<Checker> allinfo(){
		// TODO Auto-generated method stub
		return Cr.findAll();
	}


	@Override
	public Checker checkerlogin(String name, String pass) {
		// TODO Auto-generated method stub
		return Cr.findByCheckerNameAndCheckerPassword(name, pass);
	}

}
