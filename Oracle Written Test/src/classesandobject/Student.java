package classesandobject;

import java.util.Scanner;

public class Student {
   int id,mark1,mark2,mark3;
   float percentage;
   String name,department;
   
   void setData(int i,String n,String dept,int m1,int m2,int m3)
   {
	   id=i ;
	mark1=m1;
	mark2=m2;
	mark3=m3;
	name=n;
	department=dept;
	   
   }
   void percentage()
   {
	   percentage=((mark1+mark2+mark3)*100/300);
	   System.out.println("percentage: "+percentage);
   }
   void result()
   {
	   if(percentage>=75)
	   {
		   System.out.println("You got frist class with Distincation");
	   }
	   else  if(percentage>=60)
	   {
		   System.out.println("You got first class");
	   }
	   else if(percentage>=50)
	   {
		   System.out.println("You got Second class");
	   }
	   else if(percentage>=40)
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
   }
   public String toString()
   {
	   return id+" "+name+" "+department+" "+mark1+" "+mark2+" "+mark3+" "; 
   }
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	Student s1=new Student();
	System.out.println("enter id,name,dept,m1,m2,m3");
	int id=sc.nextInt();
	String department=sc.next();
	int mark1=sc.nextInt();
	int mark2=sc.nextInt();
	int mark3=sc.nextInt();
	System.out.println(s1);
	s1.percentage();
	s1.result();
	sc.close();
}
   
}
