package inheritence;

import java.util.Scanner;

public class GenerationMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Son x=new Son();
		System.out.println("enter the firstName,middleName,LastName");
		String firstName=sc.next();
		String middleName=sc.next();
		String lastName=sc.next();
		x.setGrandFatherData(firstName, middleName, lastName);
	
		System.out.println("enter the father details:");
		String ffirstName=sc.next();
		x.setFatherData(ffirstName);
		
		System.out.println("enter the son details:");
		String sfirstName=sc.next();
		x.setSonData(sfirstName);
		x.display();
		sc.close();
	}

}
