package com.sidupadhyayula.ws_heartbeat_demo.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.sidupadhyayula.ws_heartbeat_demo.dto.HeartbeatMessage;
import com.sidupadhyayula.ws_heartbeat_demo.dto.HelloMessage;

@Controller
public class WebSocketController {
	
	  @MessageMapping("/hello")         // client sends to /app/hello
	  @SendTo("/topic/hello")           // server broadcasts to /topic/hello
	  public HelloMessage hello(HelloMessage msg) {
	    String to = (msg.getFrom() == null || msg.getFrom().isBlank()) ? "client" : msg.getFrom();
	    return new HelloMessage("server", "Hello World back to " + to + " ✅");
	  }

	  @MessageMapping("/heartbeat")     // client sends to /app/heartbeat
	  @SendTo("/topic/heartbeat")       // server broadcasts to /topic/heartbeat
	  public HeartbeatMessage heartbeat(HeartbeatMessage hb) {
	    return new HeartbeatMessage("server", System.currentTimeMillis());
	  }
}
