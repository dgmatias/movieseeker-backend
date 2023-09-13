package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao {
	
	public static Connection getConnection() {
		 Connection cnx = null;
		 
		String driverName = "com.mysql.cj.jdbc.Driver"; //url do driver
		
		try {
			Class.forName(driverName);
			
			String serverName = "localhost:3306";
			String dataBase = "movieseekerdb";
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://" + serverName + "/" + dataBase;
			
			cnx = DriverManager.getConnection(url, user, password);
			
			if(cnx != null) {
				System.out.println("A conexão foi concluída com sucesso");
			} else {
				System.out.println("Houve alguma falha na conexão");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		 
		 return cnx;
	}
	
}
