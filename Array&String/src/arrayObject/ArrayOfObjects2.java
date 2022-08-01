package arrayObject;

import java.util.Scanner;

public class ArrayOfObjects2 {
	public static void main(String[] args) {
		
	
     Scanner sc=new Scanner(System.in);
     
      Student2 stud[]=new Student2 [3];
  
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
		Student2 s=new Student2();
		s.setID(id);
		s.setName(name);
		s.setDept(dept);
		s.setMarks(marks);
		
		stud[i]=s;
		
		
	}
	for(Student2 j:stud)
	{
		System.out.println(j);
	}
	sc.close();
}
}
