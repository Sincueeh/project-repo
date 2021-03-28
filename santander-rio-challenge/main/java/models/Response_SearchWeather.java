package main.java.models;

import java.util.List;

public class Response_SearchWeather{
	
	private int responseCode; 
	private String message;
	private List<ResultWeather> clima;
	

	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<ResultWeather> getClima() {
		return clima;
	}
	public void setClima(List<ResultWeather> clima) {
		this.clima = clima;
	}



}