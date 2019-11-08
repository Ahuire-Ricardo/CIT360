package cit360.controller;

import java.util.List;
import cit360.dao.InventoryDAO;
import cit360.entity.Inventory;

public class InventoryController {
	
	private InventoryDAO obj;
	
	public InventoryController() {
		  obj=new InventoryDAO();
	}
	
	public List<Inventory> TotalProduct() throws Exception{
		 return obj.List();
		}

	public List<Inventory> ProductsByName(Inventory x) throws Exception{
	 return obj.ListParameter(x);
	}
	 
	/*public List<Inventory> ProductoPorLinea(int z) throws Exception{
	 return obj.ListaxCriterio(z);
	}*/

	public Inventory ObtainProduct(Inventory x) throws Exception{
	 return obj.Read(x);
	}

	public void AddProduct(Inventory x) throws Exception{
	 obj.Create(x);
	}

	public void UpdateProduct(Inventory x) throws Exception{
	 obj.Update(x);
	}

	public void RemoveProduct(Inventory x) throws Exception{
	 obj.Delete(x);
	}


}
