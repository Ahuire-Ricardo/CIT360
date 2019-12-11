package com.warehouseproject.dao;

import org.hibernate.SessionFactory;    
import org.hibernate.cfg.Configuration;

public class HibernateUlits {
	
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
