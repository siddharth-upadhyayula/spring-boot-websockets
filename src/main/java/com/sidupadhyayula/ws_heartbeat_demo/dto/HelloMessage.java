package com.sidupadhyayula.ws_heartbeat_demo.dto;

public class HelloMessage {
	  private String from;
	  private String message;

	  public HelloMessage() {}

	  public HelloMessage(String from, String message) {
	    this.from = from;
	    this.message = message;
	  }

	  public String getFrom() { return from; }
	  public void setFrom(String from) { this.from = from; }

	  public String getMessage() { return message; }
	  public void setMessage(String message) { this.message = message; }
	}
