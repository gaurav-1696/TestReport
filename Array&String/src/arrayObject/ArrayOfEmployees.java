package arrayObject;

import java.util.Scanner;

public class ArrayOfEmployees {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		Employees ems[]=new Employees[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("enter "+(i+1)+"Employees details: ");
			System.out.println("enter the id: ");
			int id=sc.nextInt();
			System.out.println("enter the name: ");
			String name=sc.next();
			System.out.println("enter the department: ");
			String dept=sc.next();
			System.out.println("enter the salary: ");
			int salary=sc.nextInt();
			System.out.println("enter the location");
			String location=sc.next();
			ems[i]=new Employees(id,name,dept,salary,location);
			
		}
		for(Employees s:ems)
		{
			if(s.dept.equals("HR")&& s.salary>30000)
		{
			System.out.println(s);
		    }
	}
		sc.close();
}
}
