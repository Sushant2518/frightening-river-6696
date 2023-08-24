package com.masai.utility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtilis {
	static EntityManagerFactory emf;

	static {
		emf = Persistence.createEntityManagerFactory("StockDeal");
	}
	
	public static EntityManager getEntityManager() {
		
		 return emf.createEntityManager();
	}
}
