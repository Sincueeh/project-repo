package ar.com.bcba.bpm.gpyd.db;

import ar.com.bcba.bpm.gpyd.models.Tracking;
import ar.com.bcba.bpm.gpyd.utils.Insert;

import java.util.Date;
/* inserts app system performed steps */

public class Trace {

	public static void main(String sql) {
		String query = null;
		boolean ok = false;

		try {		
			query = armarRastreo(sql);
			ok = Insert.main(query);

			if(ok) {
				System.out.println("SUCCESS");
			}else{
				System.out.println("FAILED: Check App Log File");
			}

		}catch(Exception e) {
			System.out.println("Error en DbTrace Java: "+e);
		}
	}

	private static String armarRastreo(String sql) {
		// TODO Auto-generated method stub
		Tracking r = new Tracking();
		Date date = new Date();
		String tracking = null;
		try {
			r.setContenido(sql);
			r.setFecha(date);

			tracking = armarSQL(r);
			
		}catch(Exception e) {
			System.out.println("Error en armarRastreo Java Method: "+e);
		}
		
		return tracking;
	}

	private static String armarSQL(Tracking r) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder();
		try {
			sql.append("INSERT INTO [DATABASE SCHEMA].[TABLE NAME] ");
			sql.append("SET [FIELD NAMES] ");
			sql.append("VALUES (");
			sql.append(r.getIdSolicitud());
			sql.append(",");
			sql.append(r.getNroDoc());
			sql.append(",");
			sql.append(r.getFecha());
			sql.append(",");
			sql.append(r.getProcessApp());
			sql.append(",");
			sql.append(r.getContenido());
			sql.append(")");
		}catch(Exception e){
			System.out.println("Error en armarSQL Java Method: "+e);
		}
		
		return sql.toString();
	}
}
