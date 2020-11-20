package com.borrower.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "borrower")
public class Borrower {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "borrowerId")
	private int borrowerId;

	@Column(name = "firstName", nullable = false)
	private String firstName;

	@Column(name = "lastName", nullable = false)
	private String lastName;

	@Column(name = "emailID", nullable = false, unique = true)
	private String emailID;

	public Borrower(int borrowerId, String firstName, String lastName, String emailID) {
		this.borrowerId = borrowerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	}

	public int getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
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

	public Borrower() {
		super();
	}

}
