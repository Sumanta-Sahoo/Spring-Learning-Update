package com.HB.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "bankaccount")
@FilterDef(name = "FILTER_BANK_ACCOUT_STATUS", parameters = 
	{ 
			@ParamDef(name = "accType1", type = java.lang.String.class)
	})
@Filter(name = "FILTER_BANK_ACCOUT_STATUS", condition = "accType not in (:accType1)")
public class BankAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	public BankAccount() {
		System.out.println("Zero args constructor is being used by hibernate internally");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Double accNumber;
	private String accHolderName;
	private String accType;
	private Double accBalance;
	@Version
	private Integer count;
	@CreationTimestamp
	private LocalDateTime accOpeningDate;
	@UpdateTimestamp
	private LocalDateTime accLastUpdate;

	public Double getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(Double accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(Double accBalance) {
		this.accBalance = accBalance;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public LocalDateTime getAccOpeningDate() {
		return accOpeningDate;
	}

	public void setAccOpeningDate(LocalDateTime accOpeningDate) {
		this.accOpeningDate = accOpeningDate;
	}

	public LocalDateTime getAccLastUpdate() {
		return accLastUpdate;
	}

	public void setAccLastUpdate(LocalDateTime accLastUpdate) {
		this.accLastUpdate = accLastUpdate;
	}

	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", accHolderName=" + accHolderName + ", accType=" + accType
				+ ", accBalance=" + accBalance + ", count=" + count + ", accOpeningDate=" + accOpeningDate
				+ ", accLastUpdate=" + accLastUpdate + "]";
	}

}
