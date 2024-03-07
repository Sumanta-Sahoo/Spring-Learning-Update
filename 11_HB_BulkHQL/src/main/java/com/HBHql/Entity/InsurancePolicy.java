package com.HBHql.Entity;

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
@DynamicUpdate()
public class InsurancePolicy implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public InsurancePolicy() {
		System.out.println("Zeor args constructor being used by hibernate internally....");
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer policyId;
	private String policyHolderName;
	private String policyType;
	private String policyTenure;
	private Double policyMonthlyPremium;
	private String policyHolderNomineeName;
	@CreationTimestamp
	private LocalDateTime policyOpeningDate;
	@UpdateTimestamp
	private LocalDateTime policyLastUpdateDate;
	@Version
	private Integer updateCount;

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public void setPolicyTenure(String policyTenure) {
		this.policyTenure = policyTenure;
	}
	public void setPolicyMonthlyPremium(Double policyMonthlyPremium) {
		this.policyMonthlyPremium = policyMonthlyPremium;
	}
	public void setPolicyHolderNomineeName(String policyHolderNomineeName) {
		this.policyHolderNomineeName = policyHolderNomineeName;
	}
	public void setPolicyOpeningDate(LocalDateTime policyOpeningDate) {
		this.policyOpeningDate = policyOpeningDate;
	}
	public void setPolicyLastUpdateDate(LocalDateTime policyLastUpdateDate) {
		this.policyLastUpdateDate = policyLastUpdateDate;
	}
	public void setUpdateCount(Integer updateCount) {
		this.updateCount = updateCount;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public String getPolicyTenure() {
		return policyTenure;
	}
	public Double getPolicyMonthlyPremium() {
		return policyMonthlyPremium;
	}
	public String getPolicyHolderNomineeName() {
		return policyHolderNomineeName;
	}
	public LocalDateTime getPolicyOpeningDate() {
		return policyOpeningDate;
	}
	public LocalDateTime getPolicyLastUpdateDate() {
		return policyLastUpdateDate;
	}
	public Integer getUpdateCount() {
		return updateCount;
	}
	
	@Override
	public String toString() {
		return "InsurancePolicy [policyId=" + policyId + ", policyHolderName=" + policyHolderName + ", policyType="
				+ policyType + ", policyTenure=" + policyTenure + ", policyMonthlyPremium=" + policyMonthlyPremium
				+ ", policyHolderNomineeName=" + policyHolderNomineeName + ", policyOpeningDate=" + policyOpeningDate
				+ ", policyLastUpdateDate=" + policyLastUpdateDate + ", updateCount=" + updateCount + "]";
	}
	
	

}
