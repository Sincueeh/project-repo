package main.java.models;

public class Header {

  private String hostname;
  private String key;

  public void setHostname(String hostString){
    hostname = hostString;
  }
  public void setKey(String keyString){
    key = keyString;
  }
  public String getHostname(){
    return hostname;
  }
  public String getKey(){
    return key;
  }
}