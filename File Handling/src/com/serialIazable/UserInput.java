package com.serialIazable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
void storeObject(ArrayList<Employee>al)
{
	try {
		FileOutputStream fos =new FileOutputStream("C:\\Users\\Gaurav\\java\\userinput.txt");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	    oos.writeObject(al);
	    System.out.println("ok");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Done");
	
}
void readObject()
{
	FileInputStream fis;
	try {
		fis=new FileInputStream("C:\\Users\\Gaurav\\java\\userinput.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	ArrayList<Employee> a= (ArrayList<Employee>)ois.readObject();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee> e=new ArrayList<>();
	System.out.println("enter the employee size");
	int size=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		System.out.println("enter id,name,dept,salary");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int salary=sc.nextInt();
		e.add(new Employee(id,name,dept,salary));
		
	}
	UserInput us=new UserInput();
	us.storeObject(e);
	sc.close();
}
}
