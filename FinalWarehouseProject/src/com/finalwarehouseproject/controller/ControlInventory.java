package com.finalwarehouseproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("application/json;charset=UTF-8");
		
		ServletOutputStream out = response.getOutputStream();
		
		try {
			List<Inventory> inventory =  new InventService().getInventory();
			
			JsonConverter converter = new JsonConverter();
			String output = converter.convertToJson(inventory);

	        out.print(output);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*List<Inventory> inventory; 
		
		try {
			
			inventory=inventoryDao.List();
			
			request.setAttribute("INVENTORYLIST",inventory);
			
			RequestDispatcher myDispatcher=request.getRequestDispatcher("InventoryList.jsp");
			
			myDispatcher.forward(request, response);
		
		}catch (Exception e) {
			
			e.printStackTrace();			
			
		}*/
		
		
		
	}

}
