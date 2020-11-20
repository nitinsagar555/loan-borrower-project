package com.borrower.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.borrower.model.Borrower;
import com.borrower.repository.BorrowerRepository;

@SpringBootTest
public class BorrowerServiceTest {

	@Autowired
	private BorrowerRepository borrowerRepository;

	@Test
	void getBorrowersById() {

		Borrower borrower = new Borrower(1, "nitin", "kumar", "nitin.kumar@gmail.com");

		borrowerRepository.save(borrower);
		BorrowerService borrowerService = new BorrowerService(borrowerRepository);
		Borrower borrowerResult = borrowerService.getBorrowerId(1);

		assertEquals(borrower.getBorrowerId(), borrowerResult.getBorrowerId());
	}

	/*@Test
	void getAllBorrowers() {
		List<Borrower> borrowerList;
		borrowerList=borrowerRepository.findAll();
		BorrowerService borrowerService=new BorrowerService(borrowerRepository);
		List<Borrower> borrowerResult=borrowerService.getAllBorrower();
		
		assertEquals(borrowerList.size(), borrowerResult.size());
	}*/

}
