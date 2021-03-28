package main.java.models;

import java.util.Date;

public class Meetup {

	private String titulo; 
	private String descripcion; 
	private Usuario organizador;
	private int cupoMax;
	private int inscriptos;
	private Date fecha;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCupoMax() {
		return cupoMax;
	}
	public void setCupoMax(int cupoMax) {
		this.cupoMax = cupoMax;
	}
	public Usuario getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getInscriptos() {
		return inscriptos;
	}
	public void setInscriptos(int inscriptos) {
		this.inscriptos = inscriptos;
	} 
	
	
}
