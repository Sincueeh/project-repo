package main.java.api.weather;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import main.java.models.Request_SearchWeather;
import main.java.models.Response_SearchWeather;
import main.java.models.ResultWeather;

public class SearchWeatherData {
	public static Response_SearchWeather main (Request_SearchWeather req) {
		Response_SearchWeather rta = new Response_SearchWeather();	
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

	private static Response_SearchWeather asignarDatos(Response response, Response_SearchWeather rta) {
		// TODO Auto-generated method stub

		try {
			if (response.isSuccessful()) {
				Gson gson = new Gson();
				List<ResultWeather> list = new ArrayList<>();
				String jsonObj = response.body().string();
								
				ResultWeather json = gson.fromJson(jsonObj, ResultWeather.class);
				rta.setResponseCode(response.code());
				
				if(json != null) {
					list.add(json);
				}
				
				rta.setClima(list);
			}else {
				rta.setResponseCode(response.code());
				rta.setMessage(response.message());
			}
			
		}catch(Exception e) {
			System.out.println("Error en asignarDatos Method: "+e);
		}
		return rta;
		
	}

	private static StringBuilder armarURL(Request_SearchWeather req) {
		
		StringBuilder sb = new StringBuilder();
		try {
			
			sb.append(req.getUrl());
			sb.append("/find?");
			sb.append("cnt=");
			sb.append(req.getParams().getCnt());
			sb.append("&mode=");
			sb.append(req.getParams().getMode());
			sb.append("&lon=");
			sb.append(req.getParams().getLon());
			sb.append("&type=");
			sb.append(req.getParams().getType());
			sb.append("&lat=");
			sb.append(req.getParams().getLat());
			sb.append("&units=");
			sb.append(req.getParams().getUnits());
			sb.append("&q=");
			sb.append(req.getParams().getQ());
		}catch(Exception e) {
			System.out.println("Error en armarURL Method: "+e);
		}
		return sb;
	}
}

