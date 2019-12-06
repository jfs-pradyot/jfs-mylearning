package com.springdemo.repository;

import java.util.List;

import com.springdemo.model.Product;

public interface ProductRepository {
List<Product> getProducts();
}