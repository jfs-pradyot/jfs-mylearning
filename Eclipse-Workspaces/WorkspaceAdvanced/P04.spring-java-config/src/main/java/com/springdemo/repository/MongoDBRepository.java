package com.springdemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springdemo.model.Product;
@Repository("mongoDbRep")
public class MongoDBRepository implements ProductRepository{

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Product technology = new Product();
		technology.setProductId("P01");
		technology.setProductName("Master Spring");
		products.add(technology);
		technology = new Product();
		technology.setProductId("P02");
		technology.setProductName("Master Hibernate");
		return products;
	}

}