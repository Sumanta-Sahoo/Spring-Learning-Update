package com.hb.Entity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@DynamicInsert()
public class Student {

	public Student() {
		System.out.println("This zero arg constructor is being used by hibernate internally");
	}

	@Id
	@GenericGenerator(name="gen1", strategy = "com.hb.CGenerator.StudentCustomGenerator")
	@GeneratedValue(generator = "gen1")
	private String StdID;
	private String StdName;
	private String StdRegNo;
	private String StdAddr;
	private String StdContact;
	public String getStdID() {
		return StdID;
	}
	public void setStdID(String stdID) {
		StdID = stdID;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public String getStdRegNo() {
		return StdRegNo;
	}
	public void setStdRegNo(String stdRegNo) {
		StdRegNo = stdRegNo;
	}
	public String getStdAddr() {
		return StdAddr;
	}
	public void setStdAddr(String stdAddr) {
		StdAddr = stdAddr;
	}
	public String getStdContact() {
		return StdContact;
	}
	public void setStdContact(String stdContact) {
		StdContact = stdContact;
	}

	
	@Override
	public String toString() {
		return "Student [StdID=" + StdID + ", StdName=" + StdName + ", StdRegNo=" + StdRegNo + ", StdAddr=" + StdAddr
				+ ", StdContact=" + StdContact + "]";
	}
	

}
