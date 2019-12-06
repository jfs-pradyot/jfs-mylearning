package com.firtsproject.basics;

public class RestrictingPrmitiveValues {
public static void main(String[] args) {
	

	Employee emp=new Employee();
	emp.setAge(40);
	System.out.println(emp.getAge());
}
}
class Employee{
	private int age;
	
	public void setAge(int age){
		if(age>15 && age<66){
		this.age=age;
		}
		else{
			System.out.println("invalid range");
		}
	}
	
	public int getAge(){
		return age;
	}
}
