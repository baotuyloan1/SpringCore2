package com.baonguyen.qualifierAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author BAO 6/23/2023
 */

public interface MessageService {

   public void sendMsg(String message);

}
