package collections;

import java.io.IOException;

public class TestException {
	public static void main(String[] args){
		try {
			test();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void test()throws MyException{
		System.out.println();
		throw new MyException();
		
	}
}

class MyException extends IOException{
	MyException(){
		System.out.println("This is Myexception");
	}
}