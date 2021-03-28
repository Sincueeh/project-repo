package main.test.java;

import main.java.models.Header;

import main.java.models.Parameters_SearchWeather;

import main.java.models.Request_SearchWeather;

import main.java.models.Response_SearchWeather;
import main.java.models.ResultWeather;
import main.java.util.SearchWeatherData;

public class TEST_SearchWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Request_SearchWeather request = new Request_SearchWeather();
		Header hdr = new Header();
		Parameters_SearchWeather param = new Parameters_SearchWeather();
		Response_SearchWeather rta = new Response_SearchWeather();
		hdr.setHostname("community-open-weather-map.p.rapidapi.com");
		hdr.setKey("0bef6569camshe69320ac8e421c5p1c470cjsn13048168458e");
		request.setHeader(hdr);
		request.setUrl("https://community-open-weather-map.p.rapidapi.com");
		param.setLat(0);
		param.setLon(0);
		param.setCnt(1);
		param.setMode("accurate");
		param.setQ("Buenos Aires, Argentina");
		param.setUnits("metric");
		request.setParams(param);
		rta = SearchWeatherData.main(request);

		if(!rta.getClima().isEmpty()) {
			for (ResultWeather rw : rta.getClima()) {
				System.out.println(rw.getCount());
			}
		}
				
		
		//System.out.println("Current Weather Data: "+rta.getClima());
	}

}
