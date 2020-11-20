package com.loan.model;

import java.sql.Date;

public class Loan {
	
	public int loanId;
	private int loanAmount;
	private float rateOfInterest;
	public int borrowerId;
	private String propertyAddressId;
	private Date startDate;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getPropertyAddressId() {
		return propertyAddressId;
	}
	public void setPropertyAddressId(String propertyAddressId) {
		this.propertyAddressId = propertyAddressId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	

}
