package com.baonguyen.qualifierAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author BAO 6/23/2023
 */
@Configuration
@ComponentScan("com.baonguyen.qualifierAnnotation")
public class AppConfiguration {

  @Bean(name = "emailService")
  public MessageService emailService() {
    return new EmailService();
  }

  @Bean(name = "twitterService")
  public MessageService twitterService() {
    return new TwitterService();
  }

  @Bean(name = "smsService")
  public MessageService smsService() {
    return new SMSService();
  }

  @Bean
  public MessageProcessor messageProcessor() {
    return new MessageProcessor();
  }
}
