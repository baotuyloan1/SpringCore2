package com.baonguyen.primaryAnnotation;

/**
 * @author BAO 6/23/2023
 */
public class EmailService implements MessageService {

  @Override
  public void sendMsg(String message) {
    System.out.println("Email" + message);
  }
}
