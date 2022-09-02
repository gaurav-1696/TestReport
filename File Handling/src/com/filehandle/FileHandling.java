package com.filehandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	void readfile()
	{
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Gaurav\\java\\filehandling.txt");
			int i;
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
void writeData()
{
	try {
		FileOutputStream fr= new FileOutputStream("C:\\Users\\Gaurav\\java\\filehandling.txt",true);
		String s=" jungle";
		int c;
		for(int i=0;i<s.length();i++)
    {
			 c=s.charAt(i);
			fr.write(c);
		}
		fr.close();
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	FileHandling fs=new FileHandling();
	
	fs.writeData();
	fs.readfile();
}
}
