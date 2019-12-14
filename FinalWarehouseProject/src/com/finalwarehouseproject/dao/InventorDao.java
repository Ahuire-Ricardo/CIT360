package com.finalwarehouseproject.dao;

import java.util.List;

import com.finalwarehouseproject.entity.Inventory;

public interface InventorDao {
	
	public List<Inventory> findAll();

}
