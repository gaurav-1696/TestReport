package classesObjects;

import java.util.Scanner;

public class Students {
	int id,marks;
	String name,dpt;
	void setData(int id,String name,String dpt,int marks)
	{
		this.id=id;
		this.name=name;
		this.dpt=dpt;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+dpt+" "+marks+" ";
	}
	public static void main(String[] args) {
		int id, marks;
		String name, dept;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id,name,dept,marks");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		marks = sc.nextInt();
	Students e1 = new Students();
	  e1.setData(id, name, dept, marks);
	  System.out.println("Student Data:");
	  System.out.println(e1);
      sc.close();
	}
}
