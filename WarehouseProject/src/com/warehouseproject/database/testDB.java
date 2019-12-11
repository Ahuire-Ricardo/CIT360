package com.warehouseproject.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;


import com.warehouseproject.dao.HibernateUlits;
import com.warehouseproject.entity.Inventory;

public class testDB {
	
	private static Session session;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		session=HibernateUlits.getSessionFactory().openSession();
		
		String HQL = "FROM Inventory";
		
		Query<Inventory> query = session.createQuery(HQL,Inventory.class);
		
		List<Inventory> inventory = query.list();
				
		 for (Inventory inventor : inventory) {
		      System.out.println(inventor.getInvName());
		 }
	}

}
