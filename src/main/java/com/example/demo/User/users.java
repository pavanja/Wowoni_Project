package com.example.demo.User;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.Project.Project;

@Entity
public class users {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO) 
    private int user_id;
    private String userName;  // Changed to camelCase
    private String userEmail;  // Changed to camelCase
    private String userDOB;
    private String role;
    private String userPassword;  // Changed to camelCase
    private String userConfirmPass;  // Changed to camelCase
    
    @OneToMany(mappedBy = "user")
    private List<Project> projects;
    

    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	// Getters and Setters
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {  // Changed to camelCase
        return userName;
    }

    public void setUserName(String userName) {  // Changed to camelCase
        this.userName = userName;
    }

    public String getUserEmail() {  // Changed to camelCase
        return userEmail;
    }

    public void setUserEmail(String userEmail) {  // Changed to camelCase
        this.userEmail = userEmail;
    }

    public String getUserDOB() {  // Changed to camelCase
        return userDOB;
    }

    public void setUserDOB(String userDOB) {  // Changed to camelCase
        this.userDOB = userDOB;
    }

    public String getUserPassword() {  // Changed to camelCase
        return userPassword;
    }

    public void setUserPassword(String userPassword) {  // Changed to camelCase
        this.userPassword = userPassword;
    }

    public String getUserConfirmPass() {  // Changed to camelCase
        return userConfirmPass;
    }

    public void setUserConfirmPass(String userConfirmPass) {  // Changed to camelCase
        this.userConfirmPass = userConfirmPass;
    }

    @Override
	public String toString() {
		return "users [user_id=" + user_id + ", userName=" + userName + ", userEmail=" + userEmail + ", userDOB="
				+ userDOB + ", role=" + role + ", userPassword=" + userPassword + ", userConfirmPass=" + userConfirmPass
				+ ", projects=" + projects + "]";
	}
}	
