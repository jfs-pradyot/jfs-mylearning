package com.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.springdemo"})
public class AppConfig {
//	@Bean(name = "productService")
//	public ProductService getProductService() {
//		//constructor injection
//		ProductService productService = new ProductServiceImpl(getProductRepository());
//		return productService;
//	}
//
//	@Bean(name = "productRepository")
//	public ProductRepository getProductRepository() {
//		return new MongoDBRepository();
//	}
}
