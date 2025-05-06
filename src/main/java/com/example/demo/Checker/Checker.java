package com.example.demo.Checker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Checker {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "checker_id")
    private int checkerId;
    @Column(name = "checker_name")
    private String checkerName;
    @Column(name = "checker_role")
    private String checkerRole;
    @Column(name = "checker_password")
    private String checkerPassword;
	public int getCheckerId() {
		return checkerId;
	}
	public void setCheckerId(int checkerId) {
		this.checkerId = checkerId;
	}
	public String getCheckerName() {
		return checkerName;
	}
	public void setCheckerName(String checkerName) {
		this.checkerName = checkerName;
	}
	public String getCheckerRole() {
		return checkerRole;
	}
	public void setCheckerRole(String checkerRole) {
		this.checkerRole = checkerRole;
	}
	public String getCheckerPassword() {
		return checkerPassword;
	}
	public void setCheckerPassword(String checkerPassword) {
		this.checkerPassword = checkerPassword;
	}
	@Override
	public String toString() {
		return "Checker [checkerId=" + checkerId + ", checkerName=" + checkerName + ", checkerRole=" + checkerRole
				+ ", checkerPassword=" + checkerPassword + "]";
	}

   
}
