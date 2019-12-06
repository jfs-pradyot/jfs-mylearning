package com.quicktest;

import java.nio.channels.ScatteringByteChannel;

public class QuickTest {
public static void main(String[] args) {
	
	String string=new String("admin");
	String name=string;
	String password=string;
	String name_lower=name;
//	String admin="admin";
	String number="first";
	String number1="first";
	String number2=number;
	
	if(number2=="first"){
		System.out.println("equls number11");
	}
	else{
		System.out.println("unequals");
	}
	if(name=="admin"){
		System.out.println("admin is equal");
	}
	else{
		System.out.println("admin is not equal");
	}
	
	if(number==number1){
		System.out.println("equals");
	}
	
	if(password==name){
		System.out.println("equals");
	}
////	if(admin==name){
//		System.out.println("adequals");
//	}
//	else{
//		System.out.println("not equals");
//	}
//	
//	if(admin==string){
//		System.out.println("equals");
//	}else{
//		System.out.println("not equals");
//	}
//	if(admin == new String("admin")){
//		System.out.println("equals");
//	}
//	else{
//		System.out.println("not equals");
//	}
	if(new String()=="admin"){
		System.out.println("equals it");
	}
	if(number =="first"){
		System.out.println("equals numjber");
	}
}
}
