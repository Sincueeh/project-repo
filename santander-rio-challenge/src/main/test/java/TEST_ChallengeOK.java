package main.test.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.java.ChallengeMeetup;
import main.java.models.Header;
import main.java.models.Meetup;
import main.java.models.Parameters_CurrentWeather;
import main.java.models.Parameters_SearchWeather;
import main.java.models.Request_CurrentWeather;
import main.java.models.Request_SearchWeather;
import main.java.models.Usuario;


public class TEST_ChallengeOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Usuario> users = new ArrayList<>();
		Usuario user1 = new Usuario();
		Usuario user2 = new Usuario();
		Meetup meet = new Meetup();
		Random rnd = new Random();
		Request_CurrentWeather reqApi = new Request_CurrentWeather();
		Request_SearchWeather reqS = new Request_SearchWeather(); 
		Header hdr = new Header();
		Parameters_CurrentWeather param = new Parameters_CurrentWeather();
		Parameters_SearchWeather params = new Parameters_SearchWeather();
		String url = "https://community-open-weather-map.p.rapidapi.com";
		String host = "community-open-weather-map.p.rapidapi.com";
		String key = "0bef6569camshe69320ac8e421c5p1c470cjsn13048168458e";
		hdr.setHostname(host);
		hdr.setKey(key);
		reqApi.setHeader(hdr);
		reqApi.setUrl(url);
		param.setCallback("");
		param.setId(0);
		param.setLang("es");
		param.setLat(0);
		param.setLon(0);
		param.setMode("");
		param.setQ("Buenos Aires,ar");
		param.setUnits("metric");
		reqApi.setParams(param);
		
		reqS.setUrl(url);
		reqS.setHeader(hdr);
		params.setLat(0);
		params.setLon(0);
		params.setCnt(1);
		params.setMode("accurate");
		params.setQ("Buenos Aires, Argentina");
		params.setUnits("metric");
		reqS.setParams(params);
		
		user1.setAdmin(true);
		user1.setNombre("Josefina");
		user1.setApellido("Peloso");
		user1.setUser("jp2020");
		user1.setId(rnd.nextInt());
		users.add(user1);
		
		user2.setAdmin(false);
		user2.setNombre("Jazz");
		user2.setApellido("Queen");
		user2.setUser("jq2020");
		user2.setId(rnd.nextInt());
		users.add(user2);
		
		meet.setTitulo("The Queens");
		meet.setCupoMax(700);
		
		ChallengeMeetup.main(users, meet, reqApi, reqS);
		
		
	}

}
