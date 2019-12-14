package com.finalwarehouseproject.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.finalwarehouseproject.dao.InventService;
import com.finalwarehouseproject.dao.InventoryDAO;
import com.finalwarehouseproject.entity.Inventory;
import com.google.gson.Gson;

/**
 * Servlet implementation class ControlInventory
 */
@WebServlet("/ControlInventory")
public class ControlInventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private InventoryDAO inventoryDao;
	
	@Resource(name="jdbc/Inventory")
	private DataSource myPool;
	
	

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		try {
		
			inventoryDao= new InventoryDAO();
		
		}catch (Exception e) {
			
			throw new ServletException(e);
		}
	}

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String product = request.getParameter("Select1");
		
		try {
			List<Inventory> inventory =  new InventService().getInventory(product);
			
			Gson gson=new Gson();
			PrintWriter pw=response.getWriter();
			pw.println( gson.toJson(inventory));
			pw.close();
			
			connection();
			
	      
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	private void connection() {
		String output = getUrlContents("http://localhost:8080/ModelViewController/views");
		//String output = getUrlContents("https://apis.google.com/js/client.js?onload=onLoad");
		
		//This is the actual output. It will print out the html file for the url provided above.
		System.out.println(output);
	}
	
    private static String getUrlContents(String theUrl) {
		
		// Try/catch statement to catch an exceptions being thrown. 
		StringBuilder content = new StringBuilder();
		
		try {
			
			//URL object.
			URL url = new URL(theUrl);
			
			//URLConnection object
			URLConnection urlConnection = url.openConnection();
			
			System.out.println("\nSending 'GET' request to URL : " + theUrl + "\n");
							
			//BufferedReader object.
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String line;
			
							
			// Read from the urlconnection through bufferedreader.
			while((line = bufferedReader.readLine()) != null) {
				
				content.append(line + "\n");
				
					
			}
			
			bufferedReader.close();
			
		}
		
		catch(Exception e)
		
		{
			
			e.printStackTrace();
		
		}
		
		return content.toString();
	}


	
}
