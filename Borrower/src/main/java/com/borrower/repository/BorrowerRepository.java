package com.borrower.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.borrower.model.Borrower;

public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {

}
