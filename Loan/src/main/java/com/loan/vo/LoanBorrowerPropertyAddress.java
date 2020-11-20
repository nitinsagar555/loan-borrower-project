package com.loan.vo;

import java.sql.Date;

import com.loan.model.Borrower;
import com.loan.model.Loan;
import com.loan.model.PropertyAddress;

public class LoanBorrowerPropertyAddress {

	private int loanId;
	private int loanAmount;
	private float rateOfInterest;
	private int borrowerId;
	private String propertyAddressId;
	private Date startDate;

	private String firstName;
	private String lastName;
	private String emailID;

	private String propertyAddressID;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String postalCode;

	public LoanBorrowerPropertyAddress(Loan loanData, Borrower borrowerData, PropertyAddress propertyAddressData) {

		loanId = loanData.loanId;
		loanAmount = loanData.getLoanAmount();
		rateOfInterest = loanData.getRateOfInterest();
		borrowerId = loanData.borrowerId;
		propertyAddressId = loanData.getPropertyAddressId();
		startDate = loanData.getStartDate();

		propertyAddressID = propertyAddressData.getPropertyAddressId();
		addressLine1 = propertyAddressData.getAddressLine1();
		addressLine2 = propertyAddressData.getAddressLine2();
		city = propertyAddressData.getCity();
		state = propertyAddressData.getState();
		postalCode = propertyAddressData.getPostalCode();
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPropertyAddressID() {
		return propertyAddressID;
	}

	public void setPropertyAddressID(String propertyAddressID) {
		this.propertyAddressID = propertyAddressID;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
