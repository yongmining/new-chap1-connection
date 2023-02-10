package com.greedy.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application2 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@oracle.team-greedy.com:1521:xe";
		String user = "C##EMPLOYEE";
		String password = "EMPLOYEE";
		
		Connection con = null;
		
		
		try {
			Class.forName(driver);
			
				con = DriverManager.getConnection(url, user, password);
				
				System.out.println(con);
		
			} catch (ClassNotFoundException e) {
				e.printStackTrace();	
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
	}

}
