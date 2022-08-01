package inheritence;

import java.util.Scanner;

public class FacultyMain {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the id,name,subject,perrating,salary,new salary");
	  int id=sc.nextInt();
	  String name=sc.next();
	  String subject=sc.next();
	  String perrating=sc.next();
	  int salary=sc.nextInt();
	  String contact=sc.next();
	  String address=sc.next();
	  String gender=sc.next();
	  
	  Faculty f=new Faculty();
	  f.setPersonData(name, contact, address, gender);
	  f.setFacultyData(id, salary, subject, perrating, salary);
	  System.out.println(f);
	  f.bonus();
	 sc.close(); 
}  
}