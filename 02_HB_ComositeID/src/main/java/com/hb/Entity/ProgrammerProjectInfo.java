package com.hb.Entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class ProgrammerProjectInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public ProgrammerProjectInfo() {}
	
	@EmbeddedId
	private ProgrammerProjectId pID;
	private String programmerName;
	private String programmerDeptNo;
	private String programmerRole;
	private String programmerProjectName;

	public ProgrammerProjectId getpID() {
		return pID;
	}

	public void setpID(ProgrammerProjectId pID) {
		this.pID = pID;
	}

	public String getProgrammerName() {
		return programmerName;
	}

	public void setProgrammerName(String programmerName) {
		this.programmerName = programmerName;
	}

	public String getProgrammerDeptNo() {
		return programmerDeptNo;
	}

	public void setProgrammerDeptNo(String programmerDeptNo) {
		this.programmerDeptNo = programmerDeptNo;
	}

	public String getProgrammerRole() {
		return programmerRole;
	}

	public void setProgrammerRole(String programmerRole) {
		this.programmerRole = programmerRole;
	}

	public String getProgrammerProjectName() {
		return programmerProjectName;
	}

	public void setProgrammerProjectName(String programmerProjectName) {
		this.programmerProjectName = programmerProjectName;
	}

	@Override
	public String toString() {
		return "ProgrammerProjectInfo [pID=" + pID + ", programmerName=" + programmerName + ", programmerDeptNo="
				+ programmerDeptNo + ", programmerRole=" + programmerRole + ", programmerProjectName="
				+ programmerProjectName + "]";
	}

}
