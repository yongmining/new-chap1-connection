package com.greedy.section02.template;

import java.sql.Connection;
import java.sql.SQLException;
import static com.greedy.section02.template.JDBCTemplate.getConnection;
import static com.greedy.section02.template.JDBCTemplate.close;

public class Application {

	public static void main(String[] args) {
		
		Connection con = /* JDBCTemplate. */getConnection();
		
		System.out.println(con);
		
//		if(con != null) {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
		/* JDBCTemplate. */ close(con); 

	}

}
