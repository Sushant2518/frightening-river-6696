package com.masai.services;

import com.masai.exception.SomeThingWentWrongException;

public interface OrderService {

	public void purchaseStock(int stockId,String stockName)throws SomeThingWentWrongException;
}
