package com.loan.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.loan.model.Loan;
import com.loan.model.PropertyAddress;


@Mapper
public interface PropertyAddressMapper {
	
	@Select("select * from propertyaddress")
	List<PropertyAddress> findAll();
	
	@Select("SELECT * from propertyaddress WHERE propertyAddressId = #{propertyAddressId}")
	PropertyAddress getPropertyAddressId(@Param("propertyAddressId") final String propertyAddressId);

	
	@Insert("INSERT INTO propertyaddress (propertyAddressID, addressLine1,addressLine2,city,state,postalCode) values(#{propertyAddressID},#{addressLine1},#{addressLine2},#{city},#{state},#{postalCode})")
	@SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="propertyAddressId", before=false, resultType=String.class)
	void insertIntopropertyAddress(PropertyAddress propertyaddress);
	

}
