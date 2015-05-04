package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRINET_LOGIN")
public class TrinetLogin {	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
	@Column(name="EMPLOYEE_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private String employeeId;
	@Column(name="PASSWORD")
	private String password;
	
}
	