package com.edu.phuxuan.k18.hoangleanhtuan.thi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.phuxuan.k18.hoangleanhtuan.thi.entity.Customer;
import com.edu.phuxuan.k18.hoangleanhtuan.thi.entity.Province;



@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	List<Customer> findAllByProvince(Province province); 
}
