package com.cts.training.dao;
import com.cts.training.model.StockPrice;


import java.util.List;


public interface StockPriceDAO {

	public boolean addStockPrice(StockPrice stockPrice);

	public boolean updateStockPrice(StockPrice stockPrice);

	public boolean deleteStockPrice(StockPrice stockPrice);

	public StockPrice getStockPriceById(int id);

	public List<StockPrice> getAllStockPrices();
	
}
