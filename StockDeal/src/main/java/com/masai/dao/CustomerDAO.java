package com.masai.dao;
import com.masai.exception.*;

import java.util.List;

import com.masai.entity.Customer;


public interface CustomerDAO {

	void addCustomer(Customer customer) throws SomeThingWentWrongException;

	List<Object[]> getCustomerList() throws SomeThingWentWrongException, NoRecordFoundException;

	void login(String username, String password) throws SomeThingWentWrongException;

	void ViewPurchasedStocks() throws SomeThingWentWrongException, NoRecordFoundException;

	void SellStock(int id, String stockName) throws SomeThingWentWrongException, NoRecordFoundException;

	void changePassword(String oldPassword, String newPassword) throws SomeThingWentWrongException;

	void deleteAccount() throws SomeThingWentWrongException;

}
