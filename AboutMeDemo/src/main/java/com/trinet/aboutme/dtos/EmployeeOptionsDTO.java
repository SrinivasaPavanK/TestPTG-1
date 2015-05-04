package com.trinet.aboutme.dtos;

public class EmployeeOptionsDTO {

private String emailOption;
private String OtherNotices;
private String W2Option;
private String WorkflowNotifications;

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

}
