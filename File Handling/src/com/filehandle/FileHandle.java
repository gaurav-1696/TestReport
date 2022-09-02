package com.filehandle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandle {
void readfile()
{
	try {
		FileReader fr=new FileReader("C:\\Users\\Gaurav\\java\\filehandling.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		br.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	FileHandle f=new FileHandle();
	f.readfile();
}
}
