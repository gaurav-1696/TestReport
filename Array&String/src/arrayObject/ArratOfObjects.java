package arrayObject;

import java.util.Scanner;

public class ArratOfObjects {

	public static void main(String[] args) {
	
		Student stud[]=new Student[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("enter "+(i+1)+"student details: ");
			System.out.println("enter the id: ");
			int id=sc.nextInt();
			System.out.println("enter the name: ");
			String name=sc.next();
			System.out.println("enter the department: ");
			String dept=sc.next();
			System.out.println("enter the marks: ");
			int marks=sc.nextInt();
			stud[i]=new Student(id,name,dept,marks);
			
		}
		for(Student s:stud)
		{
			System.out.println(s);
		}
		sc.close();
	}

}
