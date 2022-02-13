package com.source.mavenexample;

import java.security.acl.LastOwnerException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		//XML Based Configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("com/source/mavenexample/xmlApplicationContext.xml");
		Vehicle obj = (Vehicle) context.getBean("vehicleBean");
		obj.drive();
		//Annotation Based Configuration
		//    	Vehicle obj1 = (Vehicle) context.getBean("bikeBean");
		//    	obj1.drive();

		//Adding Bean Property
		//    	Tyre t = (Tyre) context.getBean("tyreBean");
		//    	System.out.println(t);

		//Autowired Example
		Car c = (Car) context.getBean("car");
		c.drive();

		//Bean Configuration With Annotation
		ApplicationContext annotationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s = (Samsung) context.getBean(Samsung.class);
		s.config();


	}
}
