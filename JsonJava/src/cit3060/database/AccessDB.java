package cit3060.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessDB {
	
	public AccessDB() {
		
	}
	
	private static final String CONTROLER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/acme";
    private static final String USER = "root";
    private static final String PASSWORD = "";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection conexion = null;
		        
		        try {
		            Class.forName(CONTROLER);
		            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
		            System.out.println("Connection OK");
		
		        } catch (ClassNotFoundException e) {
		            System.out.println("Error loading driver");
		            e.printStackTrace();
		
		        } catch (SQLException e) {
		            System.out.println("Error in the conecction");
		            e.printStackTrace();
		        }
		        
		        return conexion;
	}

}
