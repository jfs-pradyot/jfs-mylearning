package com.firtsproject.basics;



public class Test {
	public static void main(String[] args) {
	
		Test1 obj=new Test1();
		Test1 obj1=new Test1();
		Test1.x++;
		obj.display();
		obj.x++;
		obj.display();
		obj1.x++;
		obj.display();
		obj.y++;
		obj.display();
		obj1.y++;
		
		obj1.display();
	}
}


class Test1{
	//class or static variable
	static int x=100;
	//instance variable
	int y=200;
	
	void display(){
		System.out.println(x);
		System.out.println(y);
	}
	
	
}