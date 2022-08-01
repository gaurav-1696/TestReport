package com.exception;

import java.io.FileNotFoundException;

public class FileNotMain {
	public static void main(String[] args) {
		FileNot n=new FileNot();
		try
		{
			n.readfile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			n.saveFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
