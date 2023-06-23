package com.baonguyen.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author BAO 6/23/2023
 */
public class TestApplication {
    public static void main(String[] args){
//        constructor injection -> setter injection
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
       MessageProcessor processor = applicationContext.getBean(MessageProcessor.class);
       processor.processMsg(" message");
    }

}
