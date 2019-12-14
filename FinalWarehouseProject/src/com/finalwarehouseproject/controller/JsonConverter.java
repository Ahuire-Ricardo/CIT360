package com.finalwarehouseproject.controller;

import java.util.List;

import com.finalwarehouseproject.entity.Inventory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonConverter {
	
	private final Gson gson;
    
    public JsonConverter() {
        
        gson = new GsonBuilder().create();
    }

    public String convertToJson(List<Inventory> inventory) {
        
        JsonArray jarray = gson.toJsonTree(inventory).getAsJsonArray();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("inventory", jarray);

        return jsonObject.toString();
    }

}
