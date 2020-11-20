package com.borrower.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.borrower.model.Borrower;
import com.borrower.repository.BorrowerRepository;
import com.borrower.service.BorrowerService;

@RestController
public class BorrowerController {
	@Autowired
	private BorrowerRepository borrowerRepository;

	@Autowired
	private BorrowerService borrowerService;

	@GetMapping("/get-all-borrower") /* * Get all users list. */
	public List<Borrower> getAllBorrowersD() {
		return borrowerRepository.findAll();
	}

	@GetMapping("/get-borrower-by-id/{id}")
	public Borrower getBorrowerById(@PathVariable(value = "id") int borrowerId) /* Path variable for targeted value */
	{
		return borrowerService.getBorrowerId(borrowerId);
	}

	@PostMapping(value = "/post-borrower")
	public Borrower postBorrower(@RequestBody Borrower borrower) {
		borrowerRepository.save(borrower);
		return borrower;
	}
}
