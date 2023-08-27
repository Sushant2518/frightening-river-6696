package com.masai.dao;

import java.util.List;

import com.masai.entity.Stock;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWentWrongException;

public interface StockDAO {

	void addStock(Stock stock) throws SomeThingWentWrongException;
	public List<Stock> getStockList() throws SomeThingWentWrongException, NoRecordFoundException;
	public void updateStock(Stock stock) throws SomeThingWentWrongException, NoRecordFoundException;
	void DeleteStockById(int id) throws SomeThingWentWrongException, NoRecordFoundException;
}
