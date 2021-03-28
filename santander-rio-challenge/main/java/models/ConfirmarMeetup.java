package main.java.models;

public class ConfirmarMeetup {

	private boolean creada;
	private int id;
	private Meetup meet;
	
	public boolean isCreada() {
		return creada;
	}
	public void setCreada(boolean creada) {
		this.creada = creada;
	}
	public Meetup getMeet() {
		return meet;
	}
	public void setMeet(Meetup meet) {
		this.meet = meet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
