package com.finalwarehouseproject.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;

import com.finalwarehouseproject.database.AccessDB;
import com.finalwarehouseproject.entity.Inventory;

public class InventoryDAO {
	
	private static Session session;
	
	
    public void Create(Inventory o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void Update(Inventory o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void Delete(Inventory o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Inventory> ListParameter(Inventory o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Inventory Read(Inventory o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Inventory> List() throws Exception {
    
    	    session=HibernateUlits.getSessionFactory().openSession();
			
			Inventory inventory = new Inventory();
			
			Query query = session.createQuery("FROM Inventory");
			
			List inventor = query.list();
			
			List<Inventory> invent= new ArrayList<>();
			
			for (Iterator iter = inventor.iterator();iter.hasNext();) {
				Inventory in = (Inventory)iter.next();
				Integer id=  in.getInvId();
				String name =  in.getInvName();
				String description =  in.getInvDescription();
				String location = in.getInvLocation();
				BigDecimal price = in.getInvPrice();
				Short stock = in.getInvStock();
				Short weight = in.getInvWeight();
				Short size  = in.getInvSize();
				
				Inventory tempInv = new Inventory(id,name,description,location,price,stock,weight,size);
				invent.add(tempInv);
			 }
		  
		 
         return invent;
    	 }

}
