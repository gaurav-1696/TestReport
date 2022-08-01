package polymorphism;

import java.util.Scanner;

public class CompanyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter car details:");
		int id = sc.nextInt();
		String name = sc.next();
		String model = sc.next();
		int price = sc.nextInt();

		Car1 s = new Car1(id, name, model, price);
		System.out.println("Company details are:");
		int idc = sc.nextInt();
		String cname = sc.next();
		String year = sc.next();
		Company d = new Company(idc, cname, year, s);
		System.out.println(d);
		System.out.println("******************");
		sc.close();

	}
}
