package com.baonguyen;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author BAO 6/21/2023
 */
public class Main {
  /**
   * The org.springframework.beans and org.springframework.context là 2 packages cơ sở của Spring
   * Framework's IoC container.Spring framework cung cấp 2 loại containers khác nhau
   *
   * <p>BeanFactory container
   *
   * <p>ApplicationContext container
   *
   * <p>BeanFactory is the root interface of Spring IOC container. ApplicationContext is the child
   * interface of BeanFactory interface that provies SPring AOP features, i18n etc..
   *
   * <p>One main difference between BeanFactory and ApplicationContext is that BeanFactory only
   * instantiates(khởi tạo) bean when we call getBean() method while ApplicationContext instantiates
   * singleton bean when the container is started, it doesn't wait for getBean() method to be
   * called.
   *
   * <p>Spring IoC sử dụng 1 dạng configuration metadata. This configuration metadata đại diện cách
   * 1 nhà phát triển ứng dụng thông báo cho Spring container về việc khởi tạo, configure và lắp rác
   * các objects trong application
   *
   * <p>Three ways we can supply Configuration Metadata to Spring IoC container XML-based
   * configuration Annotation-based configuration Java-based configuration
   *
   * <p>How to Create a Spring Container.
   *
   * <p>Spring provides many ApplicationContext interface implementations that we use are:
   *
   * <p>AnnotationConfigApplicationContext: if we are using Spring in standalone(độc lập) Java
   * applications and using annotations for Configuration, then we can use this to initialize the
   * container and get the bean objects
   *
   * <p>ClassPathXmlApplicationContext: if we have spring bean configuration XML file in standalone
   * application, then we can use this class to load the file and get the container object.
   *
   * <p>FileSystemXmlApplicationContext: this is similar to ClassPathXmlApplicationContext except
   * that the XML configuration file can be loaded from anywhere in the file system.
   *
   * <p>Both BeanFactory and ApplicationContext interface provides getBean() method to retrieve bean
   * from spring container.
   *
   * @param args
   */
  public static void main(String[] args) {

    /** 2 câu lệnh này sẽ khởi taạo singleton bean khi start */
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    ApplicationContext context1 =
        new AnnotationConfigApplicationContext(AppConfig.class);
    HelloWorld obj = (HelloWorld) context1.getBean("helloword");

    /** Bean chỉ được khởi tạo khi beanFactory gọi đến getBean */
    XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
    HelloWorld obj1 = (HelloWorld) factory.getBean("helloword");
  }
}
