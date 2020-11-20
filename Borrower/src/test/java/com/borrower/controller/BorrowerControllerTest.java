package com.borrower.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.borrower.model.Borrower;
import com.borrower.repository.BorrowerRepository;
import com.borrower.service.BorrowerService;
import com.borrower.vo.BorrowerList;

import junit.framework.Assert;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class BorrowerControllerTest {

	@Autowired
	MockMvc mockMvc;
	RestTemplate restTemplate = new RestTemplate();
	@Autowired
	private BorrowerRepository borrowerRepository;
	@MockBean
	private BorrowerService borrowerService;

	@Test
    public void testGetBorrowerById() {
		List<Borrower> borrowerList;
		borrowerList=borrowerRepository.findAll();
		BorrowerList response = restTemplate.getForObject("http://localhost:8081/get-all-borrower", BorrowerList.class); 
		List<Borrower> list= response.getBorrower();
		assertEquals(borrowerList.size(), list.size());
    }

}
