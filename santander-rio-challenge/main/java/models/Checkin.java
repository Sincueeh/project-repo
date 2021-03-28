package main.java.models;

public class Checkin {
	private String nombre; 
	private String meetup;
	private boolean check;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMeetup() {
		return meetup;
	}
	public void setMeetup(String meetup) {
		this.meetup = meetup;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}

}
