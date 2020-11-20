package com.loan.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import com.loan.model.Loan;

@Mapper
public interface LoanMapper {

	@Select("select * from loan")
	List<Loan> findAll();

	@Select("SELECT * from loan WHERE loanId = #{loanId}")
	Loan getLoan(@Param("loanId") final int loanId);

	@Insert("insert into loan(loanId,loanAmount,rateOfInterest,borrowerId,propertyAddressId,startDate) values(#{loanId},#{loanAmount},#{rateOfInterest},#{borrowerId},#{propertyAddressId},#{startDate})")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "loanId", before = false, resultType = Integer.class)
	void insert(Loan loan);
	
	
}
