package com.edu.phuxuan.cntt.k17.demoLogin.services;

import java.util.List;

import com.edu.phuxuan.cntt.k17.demoLogin.model.Customer;



public interface CustomerService {
	List<Customer> findAll();

    Customer findById(int id);

    void save(Customer Customer);
    boolean findCustomer(Customer Customer);
    boolean checkCustomer(Customer customer);
}
