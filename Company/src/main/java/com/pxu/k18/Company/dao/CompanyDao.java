package com.pxu.k18.Company.dao;

import java.util.List;

import com.pxu.k18.Company.model.Company;

 

public interface CompanyDao {
	public List<Company> getCompanys();

	public void save(Company company);

	public Company getCompany(int companyId);

	public void delete(int companyId);
}
