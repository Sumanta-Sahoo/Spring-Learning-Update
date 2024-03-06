package com.hb.Entity;


import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@DynamicInsert()
public class Student {

	public Student() {
		System.out.println("This zero arg constructor is being used by hibernate internally");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stdID;
	private String stdName;
	private String stdRegNo;
	private String stdAddr;
	private String stdContact;

	public Integer getStdID() {
		return stdID;
	}

	public void setStdID(Integer stdID) {
		this.stdID = stdID;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdRegNo() {
		return stdRegNo;
	}

	public void setStdRegNo(String stdRegNo) {
		this.stdRegNo = stdRegNo;
	}

	public String getStdAddr() {
		return stdAddr;
	}

	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}

	public String getStdContact() {
		return stdContact;
	}

	public void setStdContact(String stdContact) {
		this.stdContact = stdContact;
	}

	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", stdName=" + stdName + ", stdRegNo=" + stdRegNo + ", stdAddr=" + stdAddr
				+ ", stdContact=" + stdContact + "]";
	}

}
