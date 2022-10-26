package com.edu.phuxuan.cntt.k17.demoLogin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.phuxuan.cntt.k17.demoLogin.model.Customer;
import com.edu.phuxuan.cntt.k17.demoLogin.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    public CustomerRepository CustomerRepository;

    @Override
    public List<Customer> findAll() {
        return this.CustomerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return this.CustomerRepository.findById(id);
    }

    @Override
    public void save(Customer Customer) {
        this.CustomerRepository.save(Customer);
    }
    @Override
    public boolean findCustomer(Customer Customer) {
    	
        return this.CustomerRepository.findCustomer(Customer);
    }

	@Override
	public boolean checkCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 return this.CustomerRepository.checkCustomer(customer);
	}
    
  
}