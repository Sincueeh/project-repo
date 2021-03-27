package ar.com.bcba.bpm.gpyd.db;

import ar.com.bcba.bpm.gpyd.models.ErrorTracking;
import ar.com.bcba.bpm.gpyd.models.Tracking;
import ar.com.bcba.bpm.gpyd.utils.Insert;

import java.util.Date;
import java.util.Random;

/* builds error tracking obj to insert */
public class ErrorTrack {

	public static void main(String sql) {

		try {

			Insert.main(setTracking(sql));

		}catch(Exception e) {
			System.out.println("Error en DbTrace Java: "+e);
		}
	}

	private static String setTracking(String sql) {

		ErrorTracking r = new ErrorTracking();
		Random uuid = new Random();
		String tracking = "";

		try {

			r.setUuid(uuid.nextInt());
			r.setRastreo(setTrackingContent(sql));

			tracking = setSQL(r);
			
		}catch(Exception e) {
			System.out.println("Error en armarRastreo Java Method: "+e);
		}

		return tracking;
	}

	private static Tracking setTrackingContent(String sql) {
		Tracking content = new Tracking();
		Date date = new Date();
		try{
			content.setContenido(sql);
			content.setFecha(date);
			content.setProcessApp("Error-Tracking");

		}catch (Exception e){
			System.out.println("Error en setTrackingContent Java Method: "+e);
		}

		return content;
	}

	private static String setSQL(ErrorTracking r) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder();
		try {
			sql.append("INSERT INTO [DATABASE SCHEMA].[TABLE NAME] ");
			sql.append("SET [FIELD NAMES] ");
			sql.append("VALUES (");
			sql.append(r.getRastreo().getFecha());
			sql.append(",");
			sql.append(r.getRastreo().getProcessApp());
			sql.append(",");
			sql.append(r.getRastreo().getContenido());
			sql.append(")");
		}catch(Exception e){
			System.out.println("Error en armarSQL Java Method: "+e);
		}
		
		return sql.toString();
	}

}