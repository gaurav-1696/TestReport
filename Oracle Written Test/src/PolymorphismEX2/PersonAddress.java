package PolymorphismEX2;

import java.util.Scanner;

public class PersonAddress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city,state, country");
		String city = sc.next();
		String state = sc.next();
		String country = sc.next();
		Address s = new Address();
		s.setCity(city);
		s.setState(state);
		s.setCountry(country);
		// System.out.println(s);
		System.out.println("enter name ,gender ,age,Address ");
		String name = sc.next();
		String gender = sc.next();
		int age = sc.nextInt();
		//String Address = sc.next();
		Person p = new Person();
		p.setName(name);
		p.setGender(gender);
		p.setAge(age);
		p.sets(s);
		System.out.println(p);
		sc.close();
	}

}
