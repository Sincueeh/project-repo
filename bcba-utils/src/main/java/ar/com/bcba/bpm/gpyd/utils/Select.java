package ar.com.bcba.bpm.gpyd.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Select {
	
	public static ResultSet main(String query) {
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
		      Class.forName("com.mysql.jdbc.Driver");
		      conn = Connect.main();
		      
		      if(conn != null) {
		    	  stm = conn.createStatement();
		    	  rs = stm.executeQuery(query);
		      }
		      
		      stm.close();
		      conn.close();
		}catch(Exception e) {
			System.out.println("Error en DbSelect Java: "+e);
		}
		
		return rs;
	}
}
