package com.baonguyen;
/**
 * @author BAO 6/21/2023
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * ApplicationContext is the central interface within a Spring application for providing
 * configuration information to the application
 *
 * <p>The interfaces BeanFactory vaf ApplicationContext represent the Spring IoC Container.
 * BeanFactory is the root interface of accessing the Spring container. It provides basic
 * functionalities for managing beans.
 *
 * <p>On the other hand, the ApplicationCOntext is a sub-interface of the BeanFactory. Therefore, it
 * offers all the functionalities of BeanFactory. Furthermore, it provides more enterprise-specific
 * functionalities.
 *
 * <p>The important features of ApplicationContext are : resolving(giải quyết) message,Supporting
 * Internationalization (Hỗ trợ đa quốc gia),Publishing Events (Xuất bản sự
 * kiện),Application-layer-specific Contexts (Ngữ cảnh cụ thể của tầng ứng dụng)
 */
public class ApplicationContextInfo {

  public static void main(String[] args) {

    /**
     * We use the FileSystemXMLApplicationContext class to load an XML-based Spring configuration
     * file from the file system or from URLs.
     */
    String path = "C:/Spring-demo/src/main/resources/spring-servlet.xml";
    ApplicationContext appContext = new FileSystemXmlApplicationContext(path);
    HelloWorld obj = appContext.getBean("helloWord", HelloWorld.class);

    /**
     * In case we want to load an XML configuration file from the classpath, we can use the
     * ClassPathXmlApplicationContext class.
     */
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("spring-servlet.xml");
    HelloWorld obj1 = appContext.getBean(HelloWorld.class);

    /**
     * If we use the XML-based configuration in a web application, we can use the
     * XmlWebApplicationContext class. Configuration classes declared and typically loaded from XML
     * file in /WEB-INF/
     */

    //    XmlWebApplicationContext context = new XmlWebApplicationContext();
    //    context.setConfigLocations(new String[]{"/WEB-INF/spring/applicationContext.xml"});
    //    context.setServletContext(con);

    /**
     * The AnnotationConfigApplicationContext class was introduced in Spring 3.0. It can take
     * classes annotated with @Configuration, @Component, and JSR-330 metadata as input.
     */
    ApplicationContext applicationContext1 =
        new AnnotationConfigApplicationContext(AppConfig.class);
    HelloWorld obj2 = applicationContext1.getBean("helloWord", HelloWorld.class);
  }
}
