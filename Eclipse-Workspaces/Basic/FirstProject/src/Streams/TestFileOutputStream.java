package Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
	public static void main(String[] args) {
		String filePath="hellostream.txt";
		//open a file and provide file path
		File file=new File(filePath);
		String str="Hi, this is a outputstream program";
		byte [] stringInByte=str.getBytes();
		
		
	try{
		
	FileOutputStream fileoutputstream =new FileOutputStream(file,true);
	fileoutputstream.write(stringInByte);
	fileoutputstream.flush();
	fileoutputstream.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
	
	
	
	
	
	}

}
