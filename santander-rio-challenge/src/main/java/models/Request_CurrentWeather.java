package main.java.models;

public class Request_CurrentWeather {

	private Header header;
	private String url;
	private Parameters_CurrentWeather params;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Parameters_CurrentWeather getParams() {
		return params;
	}
	public void setParams(Parameters_CurrentWeather params) {
		this.params = params;
	} 
	
}
