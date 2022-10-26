package com.edu.phuxuan.cntt.k17.demoLogin.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edu.phuxuan.cntt.k17.demoLogin.model.Customer;
import com.edu.phuxuan.cntt.k17.demoLogin.repository.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static final Map<Integer, Customer> Customers;

    static {
        Customers = new HashMap<>();
        Customers.put(1, new Customer(1,"tuanhoang","123","Hoang Le Anh Tuan",20,"176 Tran Phu"));
        Customers.put(2, new Customer(2,"Hoanganhtuan","123","Hoang Tuan",21,"12 Vo Thi Sau kp5 p2 txqt"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(Customers.values());
    }

    @Override
    public Customer findById(int id) {
        Customer Customer = Customers.get(id);
        return Customer;
    }

    @Override
    public void save(Customer Customer) {
        Customers.put(Customer.getId(), Customer);
    }

	@Override
	public boolean findCustomer(Customer customer) {
		// TODO Auto-generated method stub
		boolean a = false;
		
		for(Map.Entry<Integer, Customer> item : Customers.entrySet()) {
			if(item.getValue().getUserName().toString().equals(customer.getUserName().toString())
			&& item.getValue().getPassWord().toString().equals(customer.getPassWord().toString())) {
			a = true;
			break;
			}
		}
		return a;
	}

	@Override
	public boolean checkCustomer(Customer customer) {
		// TODO Auto-generated method stub
			boolean a = true;
		
		for(Map.Entry<Integer, Customer> item : Customers.entrySet()) {
			if(item.getValue().getUserName().toString().equals(customer.getUserName().toString())) {
			a = false;
			break;
			}
		}
		return a;
	}
	
    
}
