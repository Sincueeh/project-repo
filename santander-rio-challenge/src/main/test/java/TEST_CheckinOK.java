package main.test.java;

import main.java.models.Checkin;
import main.java.models.Meetup;
import main.java.models.Usuario;
import main.java.challenge.meetup.RealizarCheckin;

public class TEST_CheckinOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario user = new Usuario();
		Checkin chk = new Checkin();
		Meetup meet = new Meetup();
		
		user.setNombre("Ulises");
		user.setApellido("Fideos");
		meet.setTitulo("Jovenes Emprendedores");
		
		
		chk = RealizarCheckin.checkin(user, meet, true);
		
		System.out.println(chk.getNombre()+" se ha presentado a "+chk.getMeetup());
		
	}

}
