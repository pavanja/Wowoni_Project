package com.example.demo.Project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.User.users;

@Entity
public class Project 
{
	@Id
	private String project_id;
	private String project_name;
	private String project_lead;
	private String project_remark;
	private String project_checker_status;
	private String location;
	private String project_checker_remark;
	private String MakerStatus;
	private String maker_submit_date;
	private String checker_submit_date;
	private String userid;
	
	
	 @ManyToOne
	    @JoinColumn(name = "users") // or another name depending on your schema
	    private users user;
	 
	 
	public users getUser() {
		return user;
	}
	public void setUser(users users) {
		this.user = users;
	}
	private String mangerid;
	public String getMangerid() {
		return mangerid;
	}
	public void setMangerid(String mangerid) {
		this.mangerid = mangerid;
	}
	public String getMakerStatus() {
		return MakerStatus;
	}
	public void setMakerStatus(String makerStatus) {
		MakerStatus = makerStatus;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_lead() {
		return project_lead;
	}
	public void setProject_lead(String project_lead) {
		this.project_lead = project_lead;
	}
	public String getProject_remark() {
		return project_remark;
	}
	public void setProject_remark(String project_remark) {
		this.project_remark = project_remark;
	}
	public String getProject_checker_status() {
		return project_checker_status;
	}
	public void setProject_checker_status(String project_checker_status) {
		this.project_checker_status = project_checker_status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProject_checker_remark() {
		return project_checker_remark;
	}
	public void setProject_checker_remark(String project_checker_remark) {
		this.project_checker_remark = project_checker_remark;
	}
	public String getMaker_submit_date() {
		return maker_submit_date;
	}
	public void setMaker_submit_date(String maker_submit_date) {
		this.maker_submit_date = maker_submit_date;
	}
	public String getChecker_submit_date() {
		return checker_submit_date;
	}
	public void setChecker_submit_date(String checker_submit_date) {
		this.checker_submit_date = checker_submit_date;
	}

	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", project_lead=" + project_lead
				+ ", project_remark=" + project_remark + ", project_checker_status=" + project_checker_status
				+ ", location=" + location + ", project_checker_remark=" + project_checker_remark + ", MakerStatus="
				+ MakerStatus + ", maker_submit_date=" + maker_submit_date + ", checker_submit_date="
				+ checker_submit_date + ", userid=" + userid + ", users=" + user + ", mangerid=" + mangerid + "]";
	}
	
	public String getChecker_submit_date(String dateString) {
	    return dateString;
	}


}
