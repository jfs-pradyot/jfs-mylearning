package com.springdemo.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.model.PlanetDetails;
import com.springdemo.service.OdesseyService;

public class Application {
	public static void main(String[] args) {
		
//		OdesseyService service=new OdesseyServiceImp();
//		Load the IOC container
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		OdesseyService service=(OdesseyService)applicationContext.getBean("serviceimp");
		
		
		List<PlanetDetails> appplist=service.getPlanetDetailsService();
		//now we hae the list, if we need to iterate it, then either we can 
//		do Iterable by old way, or JAVA 8 feature forEach
	
		//forEach Method
//		appplist.forEach(product->System.out.println(product));
		
		appplist.forEach(System.out::println);
		
		
	}

}
