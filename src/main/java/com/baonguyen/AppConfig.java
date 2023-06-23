package com.baonguyen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author BAO 6/21/2023
 */

/**
 * Spring @Configuration annotation is part of the spring core framework Spring Configuration
 * annotation indicates that the class has @Bean definition methods. So Spring container can process
 * the class and generate Spring Beans to be used in the application.
 */
@Configuration
@ComponentScan("com.baonguyen")
public class AppConfig {

//  Tạo ở đây có thể xử lý thêm login, nhưng khi dùng @COmponent ở class thì không xử lý thêm logic được
  @Bean("helloWord")
  public HelloWorld helloWorld() {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.setMessage("Hello World!");
    return helloWorld;
  }
}
