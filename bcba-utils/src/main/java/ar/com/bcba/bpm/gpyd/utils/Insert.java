package ar.com.bcba.bpm.gpyd.utils;

import java.sql.Connection;
import java.sql.Statement;

import ar.com.bcba.bpm.gpyd.db.Trace;


public class Insert {
/* script which executes db insert */

	public static boolean main(String query) {

		boolean insert = false;
		Connection conn = null;
		Statement stm = null;

		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			conn = Connect.main();
			if(conn != null) {
				stm = conn.createStatement();
				stm.executeUpdate(query);

				if(stm != null) {
					Trace.main(stm.getResultSet().toString());
					insert = true;
					stm.close();
				}
				
			}
			conn.close();
		}catch(Exception e) {
			insert = false;

		}
		return insert;
	}

}
