package com.cts.training.dao;
import  com.cts.training.model.StockExchange;
import java.util.List;



public interface StockExchangeDAO {

	public boolean addStockExchange(StockExchange stockExchange);

	public boolean updateStockExchange(StockExchange stockExchange);

	public boolean deleteStockExchange(StockExchange stockExchange);

	public StockExchange getStockExchangeById(int id);

	public List<StockExchange> getAllStockExchanges();
}
