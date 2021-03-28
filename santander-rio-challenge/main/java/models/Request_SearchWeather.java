package main.java.models;

public class Request_SearchWeather {

	private Header header;
	private String url;
	private Parameters_SearchWeather params;
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
	public Parameters_SearchWeather getParams() {
		return params;
	}
	public void setParams(Parameters_SearchWeather params) {
		this.params = params;
	} 
	
}
