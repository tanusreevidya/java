package com.cts.training.stockpriceservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StockPriceRepo extends JpaRepository<StockPrice, Integer>{

}
