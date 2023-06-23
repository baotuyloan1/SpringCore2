package com.baonguyen;

import org.springframework.stereotype.Component;

/**
 * @author BAO 6/21/2023
 */
//@Component
public class HelloWorld {
  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message == null ? "Hello" : "My message: " + message;
  }
}
