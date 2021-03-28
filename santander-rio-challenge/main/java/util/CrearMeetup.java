package main.java.util;

import java.util.Random;

import main.java.models.ConfirmarMeetup;
import main.java.models.Meetup;
import main.java.models.Usuario;

public class CrearMeetup {
	
	public static ConfirmarMeetup meetup(Usuario user, Meetup meeting) {
	
		Meetup meet = new Meetup();
		ConfirmarMeetup confirmed = new ConfirmarMeetup();
		try {			
			
			meet = asignarDatosMeeting(meeting, user);
			confirmed = notificacionCM(meet);
			
			if(confirmed.isCreada()) {
				confirmed.setMeet(meet);
			}
			
		}catch(Exception e) {
			System.out.println("Error en CrearMeetup Java "+ e);
		}
		
		return confirmed;
	}

	private static Meetup asignarDatosMeeting(Meetup meeting, Usuario user) {
		// TODO Auto-generated method stub
		Meetup meet = new Meetup();
		try {
			meet.setOrganizador(user);
			meet.setTitulo(meeting.getTitulo());
			meet.setDescripcion(meeting.getDescripcion());
			meet.setCupoMax(meeting.getCupoMax());
			meet.setFecha(meeting.getFecha());
		}catch(Exception e) {
			System.out.println("Error en asignarDatosMeeting Java Method "+e);
		}
		return meet;
	}

	private static ConfirmarMeetup notificacionCM(Meetup meetup) {
		// TODO Auto-generated method stub
		Random rnm = new Random();
		ConfirmarMeetup conf = new ConfirmarMeetup();
		try {
			if(rnm != null) {
				conf.setCreada(true);
				conf.setId(rnm.nextInt());
				conf.setMeet(meetup);
			}
		}catch(Exception e) {
			System.out.println("Error en notificacionCM Java Method "+e);
		}

		
		return conf; 
	}



}
