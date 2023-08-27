package com.masai.services;

import java.util.List;

import com.masai.entity.Stock;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWentWrongException;

public interface stockService {

	void addStock(Stock stock) throws SomeThingWentWrongException;
	List<Stock> getStockList() throws SomeThingWentWrongException, NoRecordFoundException;
	void updateStock(Stock stock) throws SomeThingWentWrongException, NoRecordFoundException;
	void DeleteStockById(int id)throws SomeThingWentWrongException, NoRecordFoundException;
}
