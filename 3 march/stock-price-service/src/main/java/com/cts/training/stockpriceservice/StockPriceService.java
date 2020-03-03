package com.cts.training.stockpriceservice;

import java.util.List;


public interface StockPriceService {
	
	public StockPrice addStockPrice(StockPrice stockPrice);
    public void deleteStockPrice(int id);
    public StockPrice updateStockPrice(StockPrice stockPrice);
    public List<StockPrice> getAllStockPrices();
    public StockPrice getStockPriceById(int id);

}
