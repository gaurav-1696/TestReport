package containment;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsDepartmentsMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Departments dept[]=new Departments[3];
	
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter id,name,student list: of the "+(i+1)+" Department: ");
		int did=sc.nextInt();
		String dname=sc.next();
		
		Students studs[]=new Students[5];
		
	for(int j=0;j<5;j++)
	{
		System.out.println("enter id,name,marks,contact of the "+(j+1)+" Student: ");
		int id=sc.nextInt();
		String name=sc.next();
		int marks=sc.nextInt();
		String contact=sc.next();
		Students s=new Students();
		s.setId(id);
		s.setName(name);
		s.setMarks(marks);
		s.setContact(contact);
		studs[j]=s;
	}
	Departments f=new Departments();
	f.setId(did);
	f.setName(dname);
	dept[i]=f;
	}
	System.out.println(Arrays.toString(dept));
	/*
	 * for(Departments d:dept) { for(Students s:d.studs) { if(s.marks>60)
	 * System.out.println(d.name+" "+s.name+" "+s.marks); } }
	 */
	sc.close();
	}
	}


