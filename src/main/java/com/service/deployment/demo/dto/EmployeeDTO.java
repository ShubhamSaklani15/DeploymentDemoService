package com.service.deployment.demo.dto;

public class EmployeeDTO {
	Integer employeeId;
	String employeeName;
	Integer employeeAge;
	String phoneNo;
	String email;

	public EmployeeDTO() {
		this.employeeId = 123;
		this.employeeName = "Shubham";
		this.employeeAge = 26;
		this.phoneNo = "1234543210";
		this.email = "shubham@gmail.com";
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge="
				+ employeeAge + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}

}
