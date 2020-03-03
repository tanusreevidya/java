package com.cts.training.companyservice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cts.training.companyservice.Company;
import com.cts.training.companyservice.CompanyRepo;
import com.cts.training.companyservice.CompanyService;

@RestController
@CrossOrigin(origins="*")
public class CompanyRestServiceController {
	@Autowired
	CompanyRepo companyRepo;
	
	@Autowired
	CompanyService companyService;
	
	@RequestMapping(value="/company", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllCompanies(){
		List<Company> list = companyService.getAllCompanies();
		if(list.size()>0) {
			return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No Companies found",HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value="/company/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getCompanyById(@PathVariable int id)
	{
		try {
			Company company =  companyService.getCompanyById(id);
			return new ResponseEntity<Company>(company, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<String>("no such Company", HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value="/company", method= RequestMethod.POST)
	public ResponseEntity<Company> save(@RequestBody Company company)
	{
		companyService.addCompany(company);
		return new ResponseEntity<Company>(company,HttpStatus.CREATED);		
	}
//	public Company save(@RequestBody Company com){
//	Company comp = cr.save(com);
//	return comp;
//  }
	
	
	@RequestMapping(value="/company/{id}", method= RequestMethod.DELETE)
	public void    delete(@PathVariable int id){
		companyRepo.deleteById(id);
	}
	@RequestMapping(value = "/company", method = RequestMethod.PUT)
	public Company update(@RequestBody Company company) {
		Company comp = companyRepo.save(company);
		return comp;
	}


}
