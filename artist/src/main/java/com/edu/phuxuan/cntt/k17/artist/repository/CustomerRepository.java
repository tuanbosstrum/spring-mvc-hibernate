package com.edu.phuxuan.cntt.k17.artist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.phuxuan.cntt.k17.artist.entity.Customer;
import com.edu.phuxuan.cntt.k17.artist.entity.Province;



@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	List<Customer> findAllByProvince(Province province); 
}
