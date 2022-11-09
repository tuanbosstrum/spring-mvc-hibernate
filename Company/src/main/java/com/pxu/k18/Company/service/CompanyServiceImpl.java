package com.pxu.k18.Company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.k18.Company.dao.CompanyDao;
import com.pxu.k18.Company.model.Company; 
 
@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	public CompanyDao companyDao;
	
	@Override
	@Transactional
	public List<Company> getCompanys() {
		 
		return companyDao.getCompanys();
	}

	@Override
	@Transactional
	public void save(Company company) {
		companyDao.save(company);
		
	}

	@Override
	@Transactional
	public Company getCompany(int companyId) { 
		return companyDao.getCompany(companyId);
	}

	@Override
	@Transactional
	public void delete(int companyId) {
		companyDao.delete(companyId);
		
	}


}
