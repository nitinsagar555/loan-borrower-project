package com.loan.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.loan.model.Borrower;
import com.loan.model.Loan;
import com.loan.model.PropertyAddress;
import com.loan.repository.LoanMapper;
import com.loan.repository.PropertyAddressMapper;
import com.loan.vo.LoanBorrowerPropertyAddress;

@Service
public class LoanService {

	RestTemplate restTemplate = new RestTemplate();
	@Autowired
	PropertyAddressMapper propertyAddressMapper;
	@Autowired
	private LoanMapper loanMapper;
	Date date = new Date(2020 - 10 - 10);

	public LoanBorrowerPropertyAddress getLoanWithBorrower(int loanId) {

		Loan loanData = loanMapper.getLoan(loanId);

		Borrower borrowerData = restTemplate.getForObject("http://localhost:8081/borrower/" + loanData.getBorrowerId(),
				Borrower.class);

		PropertyAddress propertyAddressData = propertyAddressMapper
				.getPropertyAddressId(loanData.getPropertyAddressId());

		LoanBorrowerPropertyAddress loanAndBorrowerData = new LoanBorrowerPropertyAddress(loanData, borrowerData,
				propertyAddressData);

		return loanAndBorrowerData;
	}
}
