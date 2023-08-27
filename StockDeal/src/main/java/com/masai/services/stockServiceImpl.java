package com.masai.services;

import java.util.List;

import com.masai.dao.StockDAO;
import com.masai.dao.StockDAOImpl;
import com.masai.entity.Stock;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWentWrongException;

public class stockServiceImpl implements stockService {

	@Override
	public void addStock(Stock stock) throws SomeThingWentWrongException {
		StockDAO stockDAO = new StockDAOImpl();
		stockDAO.addStock(stock);
	}

	@Override
	public List<Stock> getStockList() throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		
		StockDAO stockDAO = new StockDAOImpl();
		return stockDAO.getStockList();
	}

	@Override
	public void updateStock(Stock stock) throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		StockDAO stockDAO = new StockDAOImpl();
		stockDAO.updateStock(stock);
		
	}

	@Override
	public void DeleteStockById(int id) throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		StockDAO stockDAO = new StockDAOImpl();
		stockDAO.DeleteStockById(id);
		
	}
	
	

}
