package com.hb.Entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProgrammerProjectId implements Serializable {

	private static final long serialVersionUID = 1L;

	public ProgrammerProjectId() {
	}

	private Integer proID;
	private Integer projectID;

	public Integer getProID() {
		return proID;
	}

	public void setProID(Integer proID) {
		this.proID = proID;
	}

	public Integer getProjectID() {
		return projectID;
	}

	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
	}

	@Override
	public String toString() {
		return "ProgrammerProjectId [proID=" + proID + ", projectID=" + projectID + "]";
	}

}
