package com.borrower.vo;

import java.util.ArrayList;
import java.util.List;

import com.borrower.model.Borrower;

public class BorrowerList {
	
	private List<Borrower> borrower;
	
	BorrowerList() {
		borrower=new ArrayList<>();
	}

	public List<Borrower> getBorrower() {
		return borrower;
	}

	public void setBorrower(List<Borrower> borrower) {
		this.borrower = borrower;
	}

}
