package com.cts.training.initialpublicofferingsservice;

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

import com.cts.training.initialpublicofferingsservice.InitialPublicOffering;
import com.cts.training.initialpublicofferingsservice.InitialPublicOfferingRepo;
import com.cts.training.initialpublicofferingsservice.InitialPublicOfferingService;

@RestController
@CrossOrigin(origins="*")
public class InitialPublicOfferingRestServiceController {
	@Autowired
	InitialPublicOfferingRepo ipoRepo;
	
	@Autowired
	InitialPublicOfferingService ipoService;
	
	@RequestMapping(value="/ipo", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<InitialPublicOffering> findAll(){
		return ipoRepo.findAll();
	}
	@RequestMapping(value="/ipo/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public InitialPublicOffering findone(@PathVariable int id){
		Optional<InitialPublicOffering> ipoffering = ipoRepo.findById(id);
		InitialPublicOffering ipo = ipoffering.get();
		return ipo;
	}
	@RequestMapping(value="/ipo", method= RequestMethod.POST)
	public ResponseEntity<InitialPublicOffering> save(@RequestBody InitialPublicOffering ipo)
	{
		ipoService.addIpo(ipo);
		return new ResponseEntity<InitialPublicOffering>(ipo,HttpStatus.CREATED);		
	}
//	public IPO save(@RequestBody IPO ipo){
//		IPO ip = ir.save(ipo);
//		return ip;
//	}
	@RequestMapping(value="/ipo/{id}", method= RequestMethod.DELETE)
	public void    delete(@PathVariable int id){
		ipoRepo.deleteById(id);
	}
	@RequestMapping(value = "/ipo", method = RequestMethod.PUT)
	public InitialPublicOffering update(@RequestBody InitialPublicOffering ipo) {
		InitialPublicOffering ip = ipoRepo.save(ipo);
		return ip;
	}


}
