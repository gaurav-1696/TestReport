package com.serialIazable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {
     void storeObject()
     {
    	 try {
			FileOutputStream fos=new FileOutputStream(("C:\\Users\\Gaurav\\java\\object.txt"));
			ObjectOutputStream oos=new ObjectOutputStream(fos);
		  Employee s1=new Employee(101,"kajal","HR",70000);
               oos.writeObject(s1);	
    	 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     }
     public static void main(String[] args) {
		Example e=new Example();
		e.storeObject();
	}
}
