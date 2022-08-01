package classesandobject;

import java.util.Scanner;

public class SStudent {
	int id;
	String name;
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	String name=sc.next();
	SStudent s1=new SStudent();
	
	System.out.println(s1.id);
	System.out.println(s1.name);
	sc.close();
}
}