package main.java.util;

import main.java.models.Checkin;
import main.java.models.Meetup;
import main.java.models.Usuario;

public class RealizarCheckin {

	public static Checkin checkin(Usuario user, Meetup meet, boolean presente) {
		Checkin check = new Checkin();
		try {
			if(presente == true) {
				check = notificarPresente(meet, user);
			}
			
		}catch(Exception e) {
			System.out.println("Error en RealizarCheckin Java: "+e);
		}
		
		return check;
	}

	private static Checkin notificarPresente(Meetup meet, Usuario user) {
		// TODO Auto-generated method stub
		Checkin check = new Checkin();
		try {
			String titulo = meet.getTitulo();
			String nombre = user.getNombre()+" "+user.getApellido();
			
			check.setCheck(true);
			check.setMeetup(titulo);
			check.setNombre(nombre);
			
		}catch(Exception e) {
			System.out.println("Error en notificarPresente Method: "+e);
		}
		return check;
	}
}
