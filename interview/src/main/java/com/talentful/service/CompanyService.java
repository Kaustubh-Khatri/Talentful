package com.talentful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentful.models.Company;
import com.talentful.repos.CompanyRepo;

@Service
public class CompanyService {

	@Autowired
	CompanyRepo companyRepo;
	
	public Company getCompanyById(String companyId) {
		return companyRepo.get(companyId);
	}
	
	public Company saveCompany(Company company) {
		return companyRepo.saveIfAbsent(company);
	}
	
	public List<Company> getAllCompanies() {
		return (List<Company>) companyRepo.list();
	}
}
