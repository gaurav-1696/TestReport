package classesObjects;

import java.util.Scanner;

public class Employee {
	int id, salary;
	String name, dept, designation, rating;

	public void setData(int i, String n, String d, String e, int m, String s) {
		id = i;
		name = n;
		dept = d;
		designation = e;
		salary = m;
		rating = s;

	}

	/*
	 * void display() {
	 * System.out.println(id+" "+name+" "+dept+" "+designation+" "+salary+" "+rating
	 * ); }
	 */
	void bonus() {
		if (rating.equals("A")) {
			salary = salary * 15 / 100;
			System.out.println("bonus= " + salary);
		}
		if (rating.equals("B")) {
			salary = salary * 10 / 100;
			System.out.println("bonus= " + salary);
		}
		if (rating.equals("C")) {
			salary = salary * 5 / 100;
			System.out.println("bonus= " + salary);
		}
		if (rating.equals("D")) {

			System.out.println("no bonus");
		}

	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+designation+" "+salary+" "+rating;
	}

	public static void main(String[] args) {
		/*
		 * Employee g1=new Employee(); Employee g2=new Employee(); Employee g3=new
		 * Employee(); Employee g4=new Employee(); Employee g5=new Employee();
		 * 
		 * g1.setData(01, "gaurav", "entc", "sale", 45000, "A"); g1.display();
		 * g1.bonus(); g2.setData(02, "pravin", "mech", "design", 37500, "B");
		 * g2.display(); g2.bonus(); g3.setData(03, "Shubham", "it", "support", 41200,
		 * "C"); g3.display(); g3.bonus();
		 * 
		 * }
		 */
		int id, salary;
		String name, dept, designation, rating;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id,name,dept,designation,salary,rating");

		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		designation = sc.next();
		salary = sc.nextInt();
		rating = sc.next();

		Employee e1 = new Employee();
		e1.setData(id, name, dept, designation, salary, rating);

		Employee e2 = new Employee();
		System.out.println("enter the id,name,dept,designation,salary,rating");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		designation = sc.next();
		salary = sc.nextInt();
		rating = sc.next();
		e2.setData(id, name, dept, designation, salary, rating);

		Employee e3 = new Employee();
		System.out.println("enter the id,name,dept,designation,salary,rating");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		designation = sc.next();
		salary = sc.nextInt();
		rating = sc.next();
		e3.setData(id, name, dept, designation, salary, rating);
		
		Employee e4 = new Employee();
		System.out.println("enter the id,name,dept,designation,salary,rating");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		designation = sc.next();
		salary = sc.nextInt();
		rating = sc.next();
		e4.setData(id, name, dept, designation, salary, rating);
		
		Employee e5 = new Employee();
		System.out.println("enter the id,name,dept,designation,salary,rating");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		designation = sc.next();
		salary = sc.nextInt();
		rating = sc.next();
		e5.setData(id, name, dept, designation, salary, rating);
		
		System.out.println(e1);
		e1.bonus();
		System.out.println(e2);
		e2.bonus();
		System.out.println(e3);
		 e3.bonus();
		System.out.println(e4);
		e4.bonus();
		System.out.println(e5);
		e5.bonus();
		sc.close();
	}
}
