package main.test.java;

import main.java.models.Header;
import main.java.models.Parameters_CurrentWeather;
import main.java.models.Request_CurrentWeather;
import main.java.models.Response_CurrentWeather;
import main.java.util.GetCurrentWeather;

public class TEST_CurrentWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Request_CurrentWeather request = new Request_CurrentWeather();
		Header hdr = new Header();
		Parameters_CurrentWeather param = new Parameters_CurrentWeather();
		Response_CurrentWeather rta = new Response_CurrentWeather();
		hdr.setHostname("community-open-weather-map.p.rapidapi.com");
		hdr.setKey("0bef6569camshe69320ac8e421c5p1c470cjsn13048168458e");
		request.setHeader(hdr);
		request.setUrl("https://community-open-weather-map.p.rapidapi.com");
		param.setCallback("");
		param.setId(0);
		param.setLang("es");
		param.setLat(0);
		param.setLon(0);
		param.setMode("");
		param.setQ("Buenos Aires,ar");
		param.setUnits("metric");
		request.setParams(param);
		rta = GetCurrentWeather.main(request);

		System.out.println("Current Weather Data: "+rta.getClima().getMain().getTemp());
	}

}
