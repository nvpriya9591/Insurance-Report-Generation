package com.codingtips.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CITIZEN_PLANS_INFO")
public class CitizenPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer citizenId;
	private String citizenName;
	private String geneder;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benefitAmt;
	private String denialReason;
	private LocalDate terminateDate;
	private String terminationRsn;
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getGeneder() {
		return geneder;
	}
	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public Double getBenefitAmt() {
		return benefitAmt;
	}
	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public LocalDate getTerminateDate() {
		return terminateDate;
	}
	public void setTerminateDate(LocalDate terminateDate) {
		this.terminateDate = terminateDate;
	}
	public String getTerminationRsn() {
		return terminationRsn;
	}
	public void setTerminationRsn(String terminationRsn) {
		this.terminationRsn = terminationRsn;
	}
}
