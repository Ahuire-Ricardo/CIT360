package com.warehouseproject.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.warehouseproject.database.AccessDB;
import com.warehouseproject.entity.Inventory;

public class InventoryDAO {
	
	
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
    	  List<Inventory> list = new ArrayList<Inventory>();
    	  Connection cn = null;
    	  try {
    	   cn = AccessDB.getConnection();
    	   String sql = "SELECT INVID,INVNAME,INVDESCRIPTION,INVLOCATION,INVPRICE,INVSTOCK,INVWEIGHT,INVSIZE FROM INVENTORY ORDER BY INVNAME";
    	   Statement stm = cn.createStatement();
    	   ResultSet rs = stm.executeQuery(sql);
    	   while (rs.next()) {
    		    Inventory r = new Inventory();
	    	    r.setInvId(rs.getInt("INVID"));
	    	    r.setInvName(rs.getString("INVNAME"));
	    	    r.setInvDescription(rs.getString("INVDESCRIPTION"));
	    	    r.setInvLocation(rs.getString("INVLOCATION"));
	    	    r.setInvPrice(rs.getBigDecimal("INVPRICE"));
	    	    r.setInvStock(rs.getShort("INVSTOCK"));
	    	    r.setInvWeight(rs.getShort("INVWEIGHT"));
	    	    r.setInvSize(rs.getShort("INVSIZE"));
	    	    list.add(r);
    	   }
    	   rs.close();
    	   stm.close();
    	  } catch (Exception e) {
    	   throw e;
    	  } finally {
    	   try {
    	    cn.close();
    	   } catch (Exception e) {
    	   }
    	  }
    	  return list;
    	 }

}
