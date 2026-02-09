package com.sidupadhyayula.ws_heartbeat_demo.scheduler;

import com.sidupadhyayula.ws_heartbeat_demo.dto.*;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ServerHeartbeatScheduler {

  private final SimpMessagingTemplate template;

  public ServerHeartbeatScheduler(SimpMessagingTemplate template) {
    this.template = template;
  }

  @Scheduled(fixedRate = 5000)
  public void pushHeartbeat() {
    template.convertAndSend("/topic/heartbeat",
        new HeartbeatMessage("server", System.currentTimeMillis()));
  }
}