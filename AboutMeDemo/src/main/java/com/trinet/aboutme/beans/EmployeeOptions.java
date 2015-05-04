package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Srinivasa Pavan
 *
 */
@Entity
@Table(name="EMPLOYEE_OPTIONS")
public class EmployeeOptions {	
	
	@Id
	@Column(name="EMPLOYEE_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeId;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmailOption() {
		return emailOption;
	}
	public void setEmailOption(String emailOption) {
		this.emailOption = emailOption;
	}
	public String getOtherNotices() {
		return OtherNotices;
	}
	public void setOtherNotices(String otherNotices) {
		OtherNotices = otherNotices;
	}
	public String getW2Option() {
		return W2Option;
	}
	public void setW2Option(String w2Option) {
		W2Option = w2Option;
	}
	public String getWorkflowNotifications() {
		return WorkflowNotifications;
	}
	public void setWorkflowNotifications(String workflowNotifications) {
		WorkflowNotifications = workflowNotifications;
	}
	@Column(name="EMAIL_OPTION")
	private String emailOption;
	@Column(name="OTHER_NOTICES")
	private String OtherNotices;
	@Column(name="W2_OPTION")
	private String W2Option;
	@Column(name="WORKFLOW_NOTIFICATIONS")
	private String WorkflowNotifications;

}
