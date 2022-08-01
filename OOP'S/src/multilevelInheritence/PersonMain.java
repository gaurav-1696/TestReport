package multilevelInheritence;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Student s = new Student();
		s.setPersonData("Gaurav", "9145747297", "Nashik");
		s.setStudentData(101, 89, "Science");
		s.display();
		s.grade();
		System.out.println();
		Employee a = new Employee();
		a.setPersonData("Yashwant", "897554280", "Noida");
		a.setEmployeeData(10, "HR", 50000);
		a.display();
		a.pf();
		sc.close();
	}

}
