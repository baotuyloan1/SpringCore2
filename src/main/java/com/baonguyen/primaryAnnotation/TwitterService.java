package com.baonguyen.primaryAnnotation;

/**
 * @author BAO 6/23/2023
 */
public class TwitterService implements MessageService {
  @Override
  public void sendMsg(String message) {
    System.out.println("Twitter" + message);
  }
}
