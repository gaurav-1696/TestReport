package getter_Setter;

import java.util.Scanner;

public class Students {
	double id, percentage;
	String name, dept, city, contact;

	Students(double id, String name, double percentage, String dept, String city, String contact) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.dept = dept;
		this.city = city;
		this.contact = contact;
	}

	void grades() {
		if (percentage >= 90) {
			System.out.println("A");
		} else if (percentage >= 80) {
			System.out.println("B");
		} else if (percentage > 60) {
			System.out.println("C");

		} else if (percentage > 45) {
			System.out.println("D");
		}
	}

	public String toString() {
		return id + " " + name + " " + percentage + " " + dept + " " + city + " " + contact;
	}

	public static void main(String[] args) {

		double id, percentage;
		String name, dept, city, contact;
		System.out.println("enter the student details:");
		Scanner sc = new Scanner(System.in);
		id = sc.nextDouble();
		name = sc.next();
		percentage = sc.nextDouble();
		dept = sc.next();
		city = sc.next();
		contact = sc.next();

		Students s1 = new Students(id, name, percentage, dept, city, contact);
		System.out.println(s1);
		System.out.print("Grade:");
		s1.grades();
		sc.close();
	}
}
