package com.baonguyen.qualifierAnnotation;
/**
 * @author BAO 6/23/2023
 */
public class SMSService implements MessageService {
  @Override
  public void sendMsg(String message) {
    System.out.println("SMS"+message);
  }
}
