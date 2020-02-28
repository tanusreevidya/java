package com.cts.training.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.dto.CompanyDTO;
import com.cts.training.model.Company;
import com.cts.training.repo.CompanyRepo;
import com.cts.training.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyRepo cr;
		
	@Override
	public CompanyDTO insert(CompanyDTO cd) {
		Company ce = new Company();
		BeanUtils.copyProperties(cd, ce);
		cr.save(ce);
		return cd;
	}

}
