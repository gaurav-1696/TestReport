package com.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileReadWriteJava {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=null;
	FileInputStream fis=null;  //auto closable
	try
	{
		fis=new FileInputStream("D://Test3.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
		System.out.println((char)i);	
		}
		System.out.println();
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("output stream closed");
		fis.close();
	}
	
}

}
