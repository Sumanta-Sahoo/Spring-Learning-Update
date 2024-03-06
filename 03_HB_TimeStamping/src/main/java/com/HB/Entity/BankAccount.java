package com.HB.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
@DynamicUpdate
public class BankAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	public BankAccount() {
		System.out.println("Zero args constructor is being used by hibernate internally");
		System.out.println("BankAccount Object is instantiated");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accNumber;
	private String accHolderName;
	private Double accBalance;
	private String accType;
	@CreationTimestamp
	private LocalDateTime accOpeningDate;
	@UpdateTimestamp
	private LocalDateTime accLastUpdate;
	@Version
	private Integer count;

	static {
		System.out.println("BankAccount.class is loading ...");
	}

	public void setAccNumber(Long accNumber) {
		this.accNumber = accNumber;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public void setAccBalance(Double accBalance) {
		this.accBalance = accBalance;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setAccOpeningDate(LocalDateTime accOpeningDate) {
		this.accOpeningDate = accOpeningDate;
	}

	public void setAccLastUpdate(LocalDateTime accLastUpdate) {
		this.accLastUpdate = accLastUpdate;
	}

	public Long getAccNumber() {
		return accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public Double getAccBalance() {
		return accBalance;
	}

	public String getAccType() {
		return accType;
	}

	public LocalDateTime getAccOpeningDate() {
		return accOpeningDate;
	}

	public LocalDateTime getAccLastUpdate() {
		return accLastUpdate;
	}

	public Integer getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", accHolderName=" + accHolderName + ", accBalance=" + accBalance
				+ ", accType=" + accType + ", accOpeningDate=" + accOpeningDate + ", accLastUpdate=" + accLastUpdate
				+ ", count=" + count + "]";
	}

}
