package main.java;

import java.util.List;

import main.java.models.Checkin;
import main.java.models.ConfirmarMeetup;
import main.java.models.Meetup;
import main.java.models.Request_CurrentWeather;
import main.java.models.Request_SearchWeather;
import main.java.models.Response_CurrentWeather;
import main.java.models.Response_SearchWeather;
import main.java.models.ResultWeather;
import main.java.models.Results;
import main.java.models.Usuario;
import main.java.util.Autenticar;
import main.java.util.CrearMeetup;
import main.java.util.GetCurrentWeather;
import main.java.util.RealizarCheckin;
import main.java.util.SearchWeatherData;

public class ChallengeMeetup {

	public static void main(List<Usuario> users, Meetup meet, Request_CurrentWeather request, Request_SearchWeather reqs) {

		ConfirmarMeetup confirmacion = new ConfirmarMeetup();
		Checkin check = new Checkin();
		Response_CurrentWeather resApi = new Response_CurrentWeather();
		Boolean login = false;
		Boolean admin = false;
		Boolean asistencia = false;
		String aviso = null;
		int birras = 0;

		try {

			for (Usuario usuario : users) {
				login = Autenticar.auth(usuario);
				if(login.booleanValue() == true) {
					admin = usuario.getAdmin();
					if(admin == true) {
						confirmacion = CrearMeetup.meetup(usuario, meet);
						if(confirmacion.isCreada()) {
							int cupo = confirmacion.getMeet().getCupoMax();
							Response_SearchWeather rSearch = SearchWeatherData.main(reqs);
							if(rSearch.getResponseCode() == 200) {	
								for (ResultWeather rw : rSearch.getClima()) {
									if(rw.getList().size() > 0) {
										for (Results r : rw.getList()) { 
											birras = presupuestarBirras(cupo, r.getMain().getTemp());
										}
									}
								}
								aviso = "Se deben comprar "+birras+" cajas de birra para la meetup.";
							}
							confirmacion.getMeet().setDescripcion(aviso);
							notificarConfirmacion(confirmacion);
						}
					}else{
						if(!meet.getTitulo().isEmpty()){
							asistencia = true;
							check = RealizarCheckin.checkin(usuario, meet, asistencia);
							if(check.isCheck()) {
								resApi = GetCurrentWeather.main(request);
								notificarAsistencia(check, resApi.getClima().getMain().getTemp());
							}
						}
					}
				}
			}
		}catch(Exception e) {
			System.out.println("Error en OrganizarMeetup Java: "+e);
		}		
	}

	private static void notificarConfirmacion(ConfirmarMeetup confirmacion) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Se cre� la Meetup: "+confirmacion.getMeet().getTitulo()+" "+confirmacion.getId()+" Organizada por: "+confirmacion.getMeet().getOrganizador().getUser()+" Cupo: "+confirmacion.getMeet().getCupoMax()+" Nota: "+confirmacion.getMeet().getDescripcion());
		}catch(Exception e) {
			System.out.println("Error en notificarConfirmacion Method: "+e);
		}
	}

	private static void notificarAsistencia(Checkin check, double temp) {
		// TODO Auto-generated method stub
		try {
			System.out.println(check.getNombre()+" est� en "+check.getMeetup()+". Temperatura Actual: "+temp);
		}catch(Exception e) {
			System.out.println("Error en notificarAsistencia Method: "+e);
		}
	}

	private static int presupuestarBirras(int cupo, double temp) {
		// TODO Auto-generated method stub
		Double cervezas = 0.0;
		Double cajas = 0.0;
		int cb = 0;
		try {
			if(temp < 20) {
				cervezas = (cupo * 0.75);
			}else if(temp > 24) {
				cervezas = (double) (cupo * 2);
			}else if(temp >= 20 && temp <=24) {
				cervezas = (double) cupo;
			}
		cajas = (cervezas / 6);	
		cb = cajas.intValue() + 1;
		}catch(Exception e) {
			System.out.println("Error en presupuestarBirras Method: "+e);
		}
		
		return cb;
	}
	
}
