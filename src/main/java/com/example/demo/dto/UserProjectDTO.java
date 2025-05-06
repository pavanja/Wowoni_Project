package com.example.demo.dto;


public class UserProjectDTO {

    private String userName;
	private String projectId;
    private String projectName;
    private String projectLead;
    private String projectRemark;
    private String projectCheckerStatus;
    private String location;
    private String projectCheckerRemark;
    private String makerStatus;
    private String makerSubmitDate;
    private String checkerSubmitDate;
    private String userId;
    private String managerId;
    

public UserProjectDTO(String userName, String projectId, String projectName, String projectLead,
			String projectRemark, String projectCheckerStatus, String location, String projectCheckerRemark,
			String makerStatus, String makerSubmitDate, String checkerSubmitDate, String userId, String managerId) {
		super();
		this.userName = userName;
		
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectLead = projectLead;
		this.projectRemark = projectRemark;
		this.projectCheckerStatus = projectCheckerStatus;
		this.location = location;
		this.projectCheckerRemark = projectCheckerRemark;
		this.makerStatus = makerStatus;
		this.makerSubmitDate = makerSubmitDate;
		this.checkerSubmitDate = checkerSubmitDate;
		this.userId = userId;
		this.managerId = managerId;
	}

//    // Constructor with all required fields (matching the query result)
//    public UserProjectDTO(String userName, String projectId, String projectName, String projectLead,
//                          String projectRemark, String projectCheckerStatus, String location,
//                          String projectCheckerRemark, String makerStatus, String makerSubmitDate,
//                          String checkerSubmitDate, String userId, String managerId) {
//        this.userName = userName;
//        this.projectId = projectId;
//        this.projectName = projectName;
//        this.projectLead = projectLead;
//        this.projectRemark = projectRemark;
//        this.projectCheckerStatus = projectCheckerStatus;
//        this.location = location;
//        this.projectCheckerRemark = projectCheckerRemark;
//        this.makerStatus = makerStatus;
//        this.makerSubmitDate = makerSubmitDate;
//        this.checkerSubmitDate = checkerSubmitDate;
//        this.userId = userId;
//        this.managerId = managerId;
//    }

    // Getters and setters for each field
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public String getProjectRemark() {
        return projectRemark;
    }

    public void setProjectRemark(String projectRemark) {
        this.projectRemark = projectRemark;
    }

    public String getProjectCheckerStatus() {
        return projectCheckerStatus;
    }

    public void setProjectCheckerStatus(String projectCheckerStatus) {
        this.projectCheckerStatus = projectCheckerStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProjectCheckerRemark() {
        return projectCheckerRemark;
    }

    public void setProjectCheckerRemark(String projectCheckerRemark) {
        this.projectCheckerRemark = projectCheckerRemark;
    }

    public String getMakerStatus() {
        return makerStatus;
    }

    public void setMakerStatus(String makerStatus) {
        this.makerStatus = makerStatus;
    }

    public String getMakerSubmitDate() {
        return makerSubmitDate;
    }

    public void setMakerSubmitDate(String makerSubmitDate) {
        this.makerSubmitDate = makerSubmitDate;
    }

    public String getCheckerSubmitDate() {
        return checkerSubmitDate;
    }

    public void setCheckerSubmitDate(String checkerSubmitDate) {
        this.checkerSubmitDate = checkerSubmitDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

	@Override
	public String toString() {
		return "UserProjectDTO [userName=" + userName + ", projectId=" + projectId + ", projectName="
				+ projectName + ", projectLead=" + projectLead + ", projectRemark=" + projectRemark
				+ ", projectCheckerStatus=" + projectCheckerStatus + ", location=" + location
				+ ", projectCheckerRemark=" + projectCheckerRemark + ", makerStatus=" + makerStatus
				+ ", makerSubmitDate=" + makerSubmitDate + ", checkerSubmitDate=" + checkerSubmitDate + ", userId="
				+ userId + ", managerId=" + managerId + "]";
	}
    
    
}
