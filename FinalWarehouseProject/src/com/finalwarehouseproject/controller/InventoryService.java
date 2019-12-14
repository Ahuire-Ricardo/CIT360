package com.finalwarehouseproject.controller;

import java.util.List;

import com.finalwarehouseproject.entity.Inventory;


public interface InventoryService {
	
	 public List<Inventory> getInventory(String nameProduct);

}
