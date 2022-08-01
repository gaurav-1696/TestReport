package com.exception;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReadWrite {
public static void main(String[] args) {
	FileReader fr=null;
	FileWriter fw=null;
	File f=new File("D://Test.txt");
	try {
		fw=new FileWriter(f);
		fw.write("welcome to core java session in ThinkQuotient");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try
	{
		fr=new FileReader(f);
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	System.out.println();
}
}
