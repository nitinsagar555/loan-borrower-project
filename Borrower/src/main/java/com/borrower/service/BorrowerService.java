package com.borrower.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.borrower.model.Borrower;
import com.borrower.repository.BorrowerRepository;

@Service
public class BorrowerService {

	@Autowired
	private BorrowerRepository borrowerRepository;

	public BorrowerService(BorrowerRepository borrowerRepository2) {
		borrowerRepository=borrowerRepository2;
		
	}

	public List<Borrower> findAllBorrower() {
		List<Borrower> borrowerlist = new ArrayList<>();
		 borrowerlist=borrowerRepository.findAll();
		return borrowerlist;
	}

	public Borrower getBorrowerId(int borrowerId) {
		Optional<Borrower> result = borrowerRepository.findById(borrowerId);
		return result.get();
	}

	public void saveBorrower(Borrower borrower) {
		borrowerRepository.save(borrower);

	}

}
