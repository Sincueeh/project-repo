package ar.com.bcba.bpm.gpyd.utils;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
/* makes db connection */
public class Connect {

	/* ENV variables received from bpm app */

	static final String ENV = "";
	static final String JNDI = "";
	
	public static Connection main() {
		Context initContext = null;
		Context envContext = null;
		DataSource ds = null;
		Connection conn = null;
		try {
			initContext = new InitialContext();
			envContext = (Context) initContext.lookup(ENV);
			ds = (DataSource) envContext.lookup(JNDI);
			conn = ds.getConnection();
		}catch(Exception e) {
			System.out.println("Error en DbConnect Java: "+e);
		}
		return conn;
	}
}
