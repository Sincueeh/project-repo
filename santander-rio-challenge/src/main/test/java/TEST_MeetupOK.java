/**
 * 
 */
package main.test.java;

import java.util.Date;

import main.java.models.ConfirmarMeetup;
import main.java.models.Meetup;
import main.java.models.Usuario;
import main.java.util.CrearMeetup;


/**
 * @author jorge
 *
 */
public class TEST_MeetupOK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Meetup meet = new Meetup();
		Usuario orga = new Usuario();
		ConfirmarMeetup conf = new ConfirmarMeetup();
		
		orga.setNombre("Jorge");
		orga.setApellido("Cáceres");
		orga.setAdmin(true);

		meet.setCupoMax(250);
		meet.setDescripcion("Challenge Tecnico");
		meet.setTitulo("Santander Tecnologia");
		meet.setFecha(new Date());
		
		conf = CrearMeetup.meetup(orga, meet);
		
		System.out.println("Meetup ID: "+conf.getId()+" Titulo: "+conf.getMeet().getTitulo()+" Organizador: "+conf.getMeet().getOrganizador().getNombre()+" "+conf.getMeet().getOrganizador().getApellido()+" Cupo: "+conf.getMeet().getCupoMax()+" Fecha:"+conf.getMeet().getFecha());
		
		
	}

}
