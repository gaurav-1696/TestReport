package arrayObject;

import java.util.Scanner;

public class ArrayOfEmployee {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("enter "+(i+1)+"Employee details: ");
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
			Employee e=new Employee ();
			e.setID(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			e.setLocation(location);
			emp[i]=e;
		}
		for(Employee s:emp)
		{
			if(s.getDept().equals("HR")&& s.getSalary()>30000)
		{
			System.out.println(s);
		    }
	}
		sc.close();
}
}
