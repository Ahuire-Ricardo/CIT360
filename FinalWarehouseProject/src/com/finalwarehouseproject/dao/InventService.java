package com.finalwarehouseproject.dao;

import java.util.List;

import com.finalwarehouseproject.controller.InventoryService;
import com.finalwarehouseproject.entity.Inventory;

public class InventService implements InventoryService {
	
	InventorDao inventoryDao;
	
	public InventService() {
		
		inventoryDao = new InventoryDAO();
	}

	@Override
	public List<Inventory> getInventory() {
		// TODO Auto-generated method stub
		return inventoryDao.findAll();
	}

}
