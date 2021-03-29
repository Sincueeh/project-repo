package main.java.challenge.meetup;

import java.util.Random;

import main.java.models.ConfirmarMeetup;
import main.java.models.Inscripcion;
import main.java.models.Meetup;
import main.java.models.Usuario;


public class InscribirAMeetup {

	public static Inscripcion inscribir(Usuario user, ConfirmarMeetup meetup) {
		
		Inscripcion inscripcion = new Inscripcion();
		try {
			int idMeet = meetup.getId();
			String titulo = meetup.getMeet().getTitulo();
			int idAsistente = user.getId();
			String asistente = user.getNombre()+" "+user.getApellido();
			Random rnd = new Random();
			boolean disponible = chequearDisponibilidad(meetup.getMeet());
			
			if(disponible == true) {
				inscripcion.setIdMeet(idMeet);
				inscripcion.setTitulo(titulo);
				inscripcion.setIdAsistente(idAsistente);
				inscripcion.setAsistente(asistente);
				inscripcion.setId(rnd.nextInt());
			}			
		}catch(Exception e) {
			System.out.println("Error en InscribirAMeetup Java: "+e);
		}
		return inscripcion;
	}

	private static boolean chequearDisponibilidad(Meetup meet) {
		// TODO Auto-generated method stub
		int cupo = meet.getCupoMax();
		int inscriptos = meet.getInscriptos();
		boolean vacante = false; 
		int lugaresRestantes = cupo - inscriptos;  
		try {
			if(lugaresRestantes > 0) {
				vacante = true;
			}			
		}catch(Exception e) {
			System.out.println("Error en chequearDisponibilidad method: "+e);
		}
		
		return vacante;
	}
}
