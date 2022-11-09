package com.pxu.k18.Company.service;

import java.util.List;

import com.pxu.k18.Company.model.Company;

 

public interface CompanyService {
	public List < Company > getCompanys();
	
  	public void save(Company company);  
  	
	public Company getCompany(int companyId);
	
	public void delete(int companyId);
	
}
