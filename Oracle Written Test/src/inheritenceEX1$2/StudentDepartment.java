package inheritenceEX1$2;

import java.util.Scanner;

public class StudentDepartment {

	public static void main(String[] args) {
		
  Scanner sc=new Scanner(System.in);
	/*
	 * System.out.println("enter the details: "); int i=sc.nextInt(); String
	 * named=sc.next(); int id=sc.nextInt(); String name=sc.next(); int
	 * marks=sc.nextInt(); String contact=sc.next(); String address=sc.next();
	 */
  Department d=new Department();
 d.setDepartmentData(101, "Science");
 d.setStudentData(15, 89, "Gaurav", "9145747297", "nashik");
 
  System.out.println(d);
 
  
  sc.close();
	}

}
