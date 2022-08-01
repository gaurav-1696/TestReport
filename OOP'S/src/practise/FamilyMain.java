package practise;

import java.util.Scanner;

public class FamilyMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	  Son s=new Son();
	  System.out.println("enter the grandfather first name,middle name,last name");
	  String firstName=sc.next();
	  String middleName=sc.next();
	  String lastName=sc.next();
	  s.setGrandFatherData(firstName, middleName, lastName);
	  System.out.println("enter the father name");
	  String fatherName=sc.next();
	  s.setFatherData(fatherName);
	  System.out.println("enter the son name");
	  String sonName=sc.next();
	  s.setSonData(sonName);
	  s.display();
	  sc.close();
}
}
