package com.firtsproject.basics;

public class Product {
	Product1 product1=null;
	Product2 product2=null;
	
	public Product(Product1 mobile, Product2 laptop){
		mobile.price = 200;
		mobile.tax = 50;
		laptop.price = 150;
		laptop.tax = 40;
		
	}
	
	public static void main(String[] args) {
		
	
	
	
//	Product product=new Product();
//	int getSum=product.addProduct(product);
//	System.out.println(getSum);
	}
	public int addProduct(Product product1){
//		int productSum= productSum+ product1;
		return 2;
		
	}
}

class Product1{
	public int price;
	public int tax;
	
	
}
class Product2{
	public int price;
	public int tax;
}
