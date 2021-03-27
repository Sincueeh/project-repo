package ar.com.bcba.bpm.gpyd.models;

import java.util.Date;

public class Tracking {

	private int idSolicitud;
	private String nroDoc;
	private String processApp;
	private Date fecha;
	private String contenido;
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}
	public String getProcessApp() {
		return processApp;
	}
	public void setProcessApp(String processApp) {
		this.processApp = processApp;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
}
