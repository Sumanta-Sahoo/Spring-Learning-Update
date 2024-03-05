package hibernate.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STDTBA")
public class Student {
	@Id
	@Column(name = "stdID")
	private Integer sID;
	@Column(name = "stdName", length = 20)
	private String sName;
	@Column(name = "stdAddr", length = 20)
	private String sAddr;
	@Column(name = "stdAge", length = 20)
	private Integer sAge;

	public Student() {
		System.out.println("Hibernate uses zero argument constructor internally");
	}

	public Integer getsID() {
		return sID;
	}

	public void setsID(Integer sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddr() {
		return sAddr;
	}

	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}

	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}

	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sAddr=" + sAddr + ", sAge=" + sAge + "]";
	}

}
