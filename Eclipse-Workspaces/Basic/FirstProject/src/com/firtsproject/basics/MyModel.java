package com.firtsproject.basics;

public class MyModel {

	public static void main(String[] args) {
		ModelDetails obj=new ModelDetails();
		obj.setAge((byte)30);
		obj.setId(52527);
		obj.setName("Peter");
		obj.setDept("CS");
		obj.setSalary(42736);
		obj.getAge();
		obj.getId();
		obj.getName();
		obj.getDept();
		obj.getSalary();
		
	}
			
}

class ModelDetails{
	

	private int id;
	private byte age;
	private String name;
	private String dept;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
