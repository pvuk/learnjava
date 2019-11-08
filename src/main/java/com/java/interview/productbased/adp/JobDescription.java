package com.java.interview.productbased.adp;

public class JobDescription {

	public JobDescription(String jobId) {
		this.jobId = jobId;
	}

	private String jobId;
	private String employeeName;
	private String jobName;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}
