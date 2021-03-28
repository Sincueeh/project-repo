package main.java.util;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import main.java.models.CurrentWeather;
import main.java.models.Request_CurrentWeather;
import main.java.models.Response_CurrentWeather;

public class GetCurrentWeather {
	public static Response_CurrentWeather main (Request_CurrentWeather req) {
		Response_CurrentWeather rta = new Response_CurrentWeather();	
		try {
			OkHttpClient client = new OkHttpClient();
			String host = req.getHeader().getHostname();
			String key = req.getHeader().getKey();
			StringBuilder sb = new StringBuilder();
			
			sb = armarURL(req);
			Request request = armarRequest(host, key, sb);
			Response response = client.newCall(request).execute();
			
			rta = asignarDatos(response, rta);
						
		}catch(Exception e) {
			System.out.println("Error en RestAPIHttp Java: "+e);
		}
		
		return rta;
	}

	private static Request armarRequest(String host, String key, StringBuilder sb) {
		Request request = new Request.Builder()
			.url(sb.toString())
			.get()
			.addHeader("x-rapidapi-host", host)
			.addHeader("x-rapidapi-key", key)
			.build();
		return request;
	}

	private static Response_CurrentWeather asignarDatos(Response response, Response_CurrentWeather rta) {
		// TODO Auto-generated method stub

		try {
			if (response.isSuccessful()) {
				Gson gson = new Gson();
				String jsonObj = response.body().string();
				rta.setResponseCode(200);
				rta.setMessage("OK");
				CurrentWeather clima = gson.fromJson(jsonObj, CurrentWeather.class);
				rta.setClima(clima);
				
			}else {
				rta.setResponseCode(response.code());
				rta.setMessage(response.message());
			}
		
		}catch(Exception e) {
			System.out.println("Error en asignarDatos Method: "+e);
		}
		return rta;
		
	}

	private static StringBuilder armarURL(Request_CurrentWeather req) {
		
		StringBuilder sb = new StringBuilder();
		try {
			
			sb.append(req.getUrl());
			sb.append("/weather?");
			sb.append("lat=");
			sb.append(req.getParams().getLat());
			sb.append("&lon=");
			sb.append(req.getParams().getLon());
			sb.append("&callback=");
			sb.append(req.getParams().getCallback());
			sb.append("&id=");
			sb.append(req.getParams().getId());
			sb.append("&units=");
			sb.append(req.getParams().getUnits());
			sb.append("&lang=");
			sb.append(req.getParams().getLang());
			sb.append("&mode=");
			sb.append(req.getParams().getMode());
			sb.append("&q=");
			sb.append(req.getParams().getQ());
			
		}catch(Exception e) {
			System.out.println("Error en armarURL Method: "+e);
		}
		return sb;
	}
}

