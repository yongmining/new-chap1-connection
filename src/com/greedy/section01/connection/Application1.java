package com.greedy.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application1 {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			/* 사용할 드라이버 등록 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.team-greedy.com:1521:xe", "C##EMPLOYEE", "EMPLOYEE");
			
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
