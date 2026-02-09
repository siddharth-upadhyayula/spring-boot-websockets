package com.sidupadhyayula.ws_heartbeat_demo.dto;

public class HeartbeatMessage {
  private String from;
  private long timestamp;

  public HeartbeatMessage() {}

  public HeartbeatMessage(String from, long timestamp) {
    this.from = from;
    this.timestamp = timestamp;
  }

  public String getFrom() { return from; }
  public void setFrom(String from) { this.from = from; }

  public long getTimestamp() { return timestamp; }
  public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}