package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Admin 
{
	@Id
	private int id;
	private String adminName;
	private String adminEmail;
	private String adminPassword;
	private String adminConpass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminConpass() {
		return adminConpass;
	}
	public void setAdminConpass(String adminConpass) {
		this.adminConpass = adminConpass;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminName=" + adminName + ", adminEmail=" + adminEmail + ", adminPassword="
				+ adminPassword + ", adminConpass=" + adminConpass + "]";
	}
	
	
	
	
	
	
	
	
	

}
