package com.serialization;

import java.io.File;
import java.io.IOException;

public class FileMain {
public static void main(String[] args) {
	File f=new File("C://Example.text");
    try {
		if(f.createNewFile())
		 System.out.println("new File Created ");
		else
			System.out.println("File Already exist");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    File f1=new File("C://Example2.txt");
    
   f1.mkdir();
   System.out.println("directory is created");
   
    System.out.println(f1.getAbsolutePath());
    try {
		System.out.println(f1.getCanonicalPath());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   System.out.println( f.isDirectory());
   System.out.println( f1.isDirectory());
}
}
