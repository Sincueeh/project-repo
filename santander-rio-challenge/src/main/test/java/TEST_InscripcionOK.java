package main.test.java;

import java.util.Random;

import main.java.models.ConfirmarMeetup;
import main.java.models.Inscripcion;
import main.java.models.Meetup;
import main.java.models.Usuario;
import main.java.util.InscribirAMeetup;

public class TEST_InscripcionOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario user = new Usuario();
		ConfirmarMeetup meet = new ConfirmarMeetup();
		Meetup meetup = new Meetup(); 
		Inscripcion inscrip = new Inscripcion();
		Random rnd = new Random();
		
		user.setId(rnd.nextInt());
		user.setNombre("Agustina");
		user.setApellido("Israelson");
		meetup.setTitulo("Lideres del Futuro");
		meetup.setCupoMax(250);
		meetup.setInscriptos(249);
		meet.setId(rnd.nextInt());
		meet.setMeet(meetup);
		
		inscrip = InscribirAMeetup.inscribir(user, meet);
		
		System.out.println(inscrip.getAsistente()+" se ha inscripto correctamente a "+inscrip.getTitulo()+" "+inscrip.getIdMeet()+". Id inscripcion: "+inscrip.getId());
	}

}
