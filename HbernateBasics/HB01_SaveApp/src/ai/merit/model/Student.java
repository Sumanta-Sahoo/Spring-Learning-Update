package ai.merit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STD_TBL")
public class Student {
	
	@Id
	@Column(name="stdId")
	private int id;
	@Column(name="stdName", length=20)
	private String name;
	@Column(name="stdRegd", length=5)
	private String regd;
	
	
	
	public Student() {
		System.out.println("Zero args constructor is being internally called by hibernate");
	}
	
	public Student(int id, String name, String regd) {
		super();
		this.id = id;
		this.name = name;
		this.regd = regd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegd() {
		return regd;
	}
	public void setRegd(String regd) {
		this.regd = regd;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", regd=" + regd + "]";
	}
	
	
	
}
