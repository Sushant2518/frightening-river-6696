package com.masai.services;

import com.masai.dao.OrderDAO;
import com.masai.dao.OrderDAOImpl;
import com.masai.exception.SomeThingWentWrongException;

public class OrderServiceImpl implements OrderService {

	@Override
	public void purchaseStock(int stockId, String stockName) throws SomeThingWentWrongException {
		// TODO Auto-generated method stub

		OrderDAO orderDAO = new OrderDAOImpl();
		orderDAO.purchaseStock(stockId, stockName);

	}

}
