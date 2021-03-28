package main.java.models;

public class Inscripcion {
	
	private int id;
	private int idMeet; 
	private String titulo;
	private int idAsistente;
	private String asistente;
	public int getIdMeet() {
		return idMeet;
	}
	public void setIdMeet(int idMeet) {
		this.idMeet = idMeet;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getIdAsistente() {
		return idAsistente;
	}
	public void setIdAsistente(int idAsistente) {
		this.idAsistente = idAsistente;
	}
	public String getAsistente() {
		return asistente;
	}
	public void setAsistente(String asistente) {
		this.asistente = asistente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
