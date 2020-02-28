package com.cts.training.controller;

import java.util.List;
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

import com.cts.training.dto.CompanyDTO;
import com.cts.training.dto.RegisterDTO;
import com.cts.training.model.Company;
import com.cts.training.repo.CompanyRepo;
import com.cts.training.service.CompanyService;

@RestController
@CrossOrigin(origins="*")
public class CompanyRestServiceController {
	@Autowired
	CompanyRepo cr;
	
	@Autowired
	CompanyService cs;
	
	@RequestMapping(value="/company", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Company> findAll(){
		return cr.findAll();
	}
	@RequestMapping(value="/company/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Company findone(@PathVariable int id){
		Optional<Company> com = cr.findById(id);
		Company r = com.get();
		return r;
	}
	@RequestMapping(value="/company", method= RequestMethod.POST)
	public ResponseEntity<CompanyDTO> save(@RequestBody CompanyDTO com)
	{
		cs.insert(com);
		return new ResponseEntity<CompanyDTO>(com,HttpStatus.CREATED);		
	}
//	public Company save(@RequestBody Company com){
//	Company comp = cr.save(com);
//	return comp;
//  }
	
	
	@RequestMapping(value="/company/{id}", method= RequestMethod.DELETE)
	public void    delete(@PathVariable int id){
		cr.deleteById(id);
	}
	@RequestMapping(value = "/company", method = RequestMethod.PUT)
	public Company update(@RequestBody Company com) {
		Company comp = cr.save(com);
		return comp;
	}


}
