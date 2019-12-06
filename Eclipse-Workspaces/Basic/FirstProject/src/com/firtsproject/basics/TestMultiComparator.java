package com.firtsproject.basics;

import java.util.Comparator;

 public class TestMultiComparator {
	public int rollNo;
	public int age;
	public String name;
	
	public TestMultiComparator(int rollNo,int age,String name) {
		this.rollNo=rollNo;
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + " age=" + age + " name=" + name;
	}
	
	
 }
 
 class MultipleVariableSort implements Comparator<TestMultiComparator>
 {
	 public int compare(TestMultiComparator a, TestMultiComparator b){
		 
		 int sortbyrollno= a.rollNo-b.rollNo;
		 int sortbyname=a.name.compareTo(b.name);
		 
		 if(sortbyrollno==0){
			 return sortbyname==0 ?sortbyrollno : sortbyname;
		 }
		 else
			 return sortbyrollno;	 
	 }
 }

	


