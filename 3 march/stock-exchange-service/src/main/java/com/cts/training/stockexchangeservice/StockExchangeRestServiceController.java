package com.cts.training.stockexchangeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.stockexchangeservice.StockExchange;
import com.cts.training.stockexchangeservice.StockExchangeRepo;


@RestController
@CrossOrigin(origins="*")
public class StockExchangeRestServiceController {
	
	@Autowired
	StockExchangeRepo stockExchangeRepo;
	
	@Autowired
	StockExchangeService stockExchangeService; 
	
	@RequestMapping(value="/stockExchange", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockExchange> findAll(){
		return stockExchangeRepo.findAll();
	}
	@RequestMapping(value="/stockExchange/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockExchange findone(@PathVariable int id){
		Optional<StockExchange> stk = stockExchangeRepo.findById(id);
		StockExchange s = stk.get();
		return s;
	}
	@RequestMapping(value="/stockExchange", method= RequestMethod.POST)
	public StockExchange save(@RequestBody StockExchange stock){
		 StockExchange stk = stockExchangeRepo.save(stock);
		return stk;
	}
	@RequestMapping(value="/stockExchange/{id}", method= RequestMethod.DELETE)
	public void    delete(@PathVariable int id){
		stockExchangeRepo.deleteById(id);
	}
	@RequestMapping(value = "/stockExchange", method = RequestMethod.PUT)
	public StockExchange update(@RequestBody StockExchange stock) {
		StockExchange stk = stockExchangeRepo.save(stock);
		return stk;
	}


}
