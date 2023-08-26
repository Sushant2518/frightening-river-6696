package com.masai.dao;

import com.masai.exception.SomeThingWentWrongException;

public interface OrderDAO {

	void purchaseStock(int stockId,String stockName) throws SomeThingWentWrongException;
}
