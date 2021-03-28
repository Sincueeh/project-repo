package main.java.models;

import java.util.List;

public class ResultWeather {

	
	private String message;
	private String cod;
	private int count;
	private List<Results> list;
 
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Results> getList() {
		return list;
	}
	public void setList(List<Results> list) {
		this.list = list;
	} 
	
}
