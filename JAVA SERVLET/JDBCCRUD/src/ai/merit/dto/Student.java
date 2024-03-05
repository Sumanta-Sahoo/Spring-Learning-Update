package ai.merit.dto;

public class Student {
	private Integer sID;
	private String  sName;
	private Integer  sAge;
	private String  sAddr;
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
	public Integer getsAge() {
		return sAge;
	}
	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}

	@Override
	public String toString() {
		return sID +"\t"+ sName +"\t" + sAge +"\t" + sAddr;
	}

}
