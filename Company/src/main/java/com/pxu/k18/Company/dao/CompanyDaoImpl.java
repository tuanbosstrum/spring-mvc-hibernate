package com.pxu.k18.Company.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.pxu.k18.Company.model.Company;

 

@Repository
@EnableTransactionManagement
@Transactional
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Company> getCompanys(){
		   Session session = sessionFactory.getCurrentSession();
		   CriteriaBuilder cb = session.getCriteriaBuilder();
	        CriteriaQuery < Company > cq = cb.createQuery(Company.class);
	        Root < Company > root = cq.from(Company.class);
	        cq.select(root);
	        Query query = session.createQuery(cq);
	        return query.getResultList();
		
	}

	@Override
	public void save(Company company) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(company);
	}

	@Override
	public Company getCompany(int companyId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Company company = currentSession.get(Company.class, companyId);
        return company;
	}

	@Override
	public void delete(int companyId) {
		Session session = sessionFactory.getCurrentSession();
		Company company = session.byId(Company.class).load(companyId);
        session.delete(company);
		
	}
}
