package main.java.models;

public class Response_CurrentWeather{
	
	private int responseCode; 
	private String message;
	private CurrentWeather clima;
	

	
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
	public CurrentWeather getClima() {
		return clima;
	}
	public void setClima(CurrentWeather clima) {
		this.clima = clima;
	}


}