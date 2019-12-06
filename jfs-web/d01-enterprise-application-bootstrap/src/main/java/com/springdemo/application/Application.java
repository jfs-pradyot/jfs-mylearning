package com.springdemo.application;

import java.util.List;

import com.springdemo.model.PlanetDetails;
import com.springdemo.repository.OdesseyRepository;
import com.springdemo.service.OdesseyService;
import com.springdemo.service.OdesseyServiceImp;

public class Application {
	public static void main(String[] args) {
		OdesseyService service=new OdesseyServiceImp();
		List<PlanetDetails> appplist=service.getPlanetDetailsService();
		//now we hae the list, if we need to iterate it, then either we can 
//		do Iterable by old way, or JAVA 8 feature forEach
	
		//forEach Method
		appplist.forEach(product->System.out.println(product));
		
		appplist.forEach(System.out::println);
		
		
	}

}
