package classesObjects;

import java.util.Scanner;

public class Student2 {
  int id,marks;
  String name,dept,sports;
   void setData(int i,String n,String d,int m,String s)
   {
		id=i;
		name=n;
		dept=d;
		marks=m;
	}
/*	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks+" "+sports);
	}*/
	void sportsMarks()
	{
		if(sports.equals("Badminton"))
		{
			marks=marks+5;
			System.out.println("New Marks are: "+marks);
		}
		else if(sports.equals("Hockey"))
		{
			marks=marks+3;
			System.out.println("New Marks are: "+marks);
		}
		else if(sports.equals("Khokho"))
		{
			marks=marks+2;
			System.out.println("New marks are: "+marks);
		}
		else if(sports.equals("no"))
		{
			
			System.out.println("New marks are; "+marks);
		}
		else
		{
			marks=marks+1;
			System.out.println("New marks are; "+marks);
		}
		
	}
	public static void main(String[] args) {
	/*Student2 s1=new Student2();
	Student2 s2=new Student2();
	 s1.setData(101, "Raj", "Computer", 87, "Badminton");
	 s1.display();
	 s1.sportsMarks();
	 System.out.println();
	 
	 s2.setData(102, "Raju", "mech", 60, "khokho");
	 s2.display();
	 s2.sportsMarks();
	 System.out.println();
	 
//	 s1.setData(103, "Raj", "it", 88, "no");
//	 s1.display();
//	 s1.sportsMarks();
//	 System.out.println();
	 
	*/
		int id,marks;
		String name,dept,sports;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id,name,department,marks,sports");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		marks=sc.nextInt();
		sports=sc.next();
		  
		
		Student2 s1=new Student2();
		s1.setData(id, name, dept, marks, sports);
		
		/*
		 * Student2 s2=new Student2();
		 * System.out.println("enter the id,name,department,marks,sports");
		 * id=sc.nextInt(); name=sc.next(); dept=sc.next();
		 */
		
		
		
		
		
		
		
		sc.close();
		
	}
	
   }

