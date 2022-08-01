package practise;

import java.util.Scanner;

public class EmployeeMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Employee e[]=new Employee[2];
	for(int i=0;i<2;i++)
	{
		System.out.println("enter the employee details: ");
		int id=sc.nextInt();
		String name=sc.next();
		Dept s[]=new Dept[2];
		for(int j=0;j<2;j++)
		{
			System.out.println("enter the dept_id,dept_name");
			int dept_id=sc.nextInt();
			String dept_name=sc.next();
			s[j]=new Dept(dept_id,dept_name);
		}
		//e[i]=new Employee(id,name,s); 
		
	}
	sc.close();
}
}
