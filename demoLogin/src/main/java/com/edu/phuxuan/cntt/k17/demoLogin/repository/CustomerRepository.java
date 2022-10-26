package com.edu.phuxuan.cntt.k17.demoLogin.repository;

import java.util.List;

import com.edu.phuxuan.cntt.k17.demoLogin.model.Customer;



public interface CustomerRepository {
	  List<Customer> findAll();

	    Customer findById(int id);

	    void save(Customer customer);
	    
	    boolean findCustomer(Customer customer);
	    boolean checkCustomer(Customer customer);
}
