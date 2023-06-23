package com.baonguyen.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author BAO 6/23/2023
 */
public class MessageProcessor {

  private MessageService messageService;

//      setter based DI
  @Autowired
  @Qualifier("smsService")
  public void setMessageService(MessageService messageService) {
    this.messageService = messageService;
  }

  //    constructor based DI

  public MessageProcessor( MessageService messageService) {
    this.messageService = messageService;
  }

  public void processMsg(String message) {
    messageService.sendMsg(message);
  }

  public MessageProcessor() {
  }
}
