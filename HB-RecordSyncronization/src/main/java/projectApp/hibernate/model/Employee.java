package projectApp.hibernate.model;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@DynamicUpdate()
public class Employee {
	
	public Employee() {
		System.out.println("Zero Constructor is internally used by hibernate S/W");
	}
	
	@Id
	private Integer eID;
	private String eName;
	private String eAddr;
	private String eRole;
	
	public Integer geteID() {
		return eID;
	}
	public void seteID(Integer eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddr() {
		return eAddr;
	}
	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}
	public String geteRole() {
		return eRole;
	}
	public void seteRole(String eRole) {
		this.eRole = eRole;
	}
	
	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", eName=" + eName + ", eAddr=" + eAddr + ", eRole=" + eRole + "]";
	}
	
	
	
}
