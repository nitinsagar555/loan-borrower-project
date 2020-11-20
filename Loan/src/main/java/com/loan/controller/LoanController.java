package com.loan.controller;

import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.loan.model.Borrower;
import com.loan.model.Loan;
import com.loan.model.PropertyAddress;
import com.loan.repository.LoanMapper;
import com.loan.service.LoanService;
import com.loan.vo.LoanBorrowerPropertyAddress;

@Component
@RestController
@RequestMapping("/loan-ms")
public class LoanController {

	RestTemplate restTemplate = new RestTemplate();
	@Autowired
	LoanService loanService;
	@Autowired
	private LoanMapper loanMapper;
	Date date = new Date(2020 - 10 - 10);

	public LoanController(LoanMapper loanMapper) {
		this.loanMapper = loanMapper;
	}

	@GetMapping("/get-loan-details")
	public List<Loan> getLoanDetails() {
		return loanMapper.findAll();
	}

	@GetMapping("/loan-by-Id/{id}")
	public Loan getLoanById(@PathVariable("id") Integer loanId) {
		return loanMapper.getLoan(loanId);
	}

	@GetMapping("/loan-borrower")
	Borrower[] getBorrowerAllDetails() {
		return restTemplate.getForObject("http://localhost:8081/get-borrower", Borrower[].class);
	}

	@GetMapping("/get-loan-borrower/{id}")
	public Borrower getBorrowerdetails(@PathVariable("id") int borrowerId) {
		return restTemplate.getForObject("http://localhost:8081/borrower/" + borrowerId, Borrower.class);
	}

	@PostMapping("/update-loan")
	private List<Loan> updateLoanDetails() {
		Loan loan = new Loan();
		loan.setLoanId(20);
		loan.setLoanAmount(5001);
		loan.setRateOfInterest(3);
		loan.setBorrowerId(7);
		loan.setPropertyAddressId("koramangala1");
		loan.setStartDate(date);
		loanMapper.insert(loan);
		return loanMapper.findAll();
	}

	@GetMapping("/loan-borrower-details/{id}")
	public LoanBorrowerPropertyAddress getLoanWithBorrowerId(@PathVariable("id") int loanId) {
		return loanService.getLoanWithBorrower(loanId);
	}
}
