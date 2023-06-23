package com.baonguyen;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author BAO 6/21/2023
 */
public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfig.class);
    HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
    System.out.println(helloWorld.getMessage());

    applicationContext.close();

    XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
    HelloWorld helloWorld1 = factory.getBean(HelloWorld.class);
    System.out.println(helloWorld1.getMessage());
  }
}
