package inheritence;

import java.util.Scanner;

public class Bike1Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the price,color,milage,name,weight,modelno");
		int price = sc.nextInt();
		String color = sc.next();
		String milage = sc.next();
		String name = sc.next();
		int weight = sc.nextInt();
		String modelno = sc.next();
		Pulsor1 p1 = new Pulsor1();

		p1.setPrice(price);
		p1.setColor(color);
		p1.setMilage(milage);
		p1.setName(name);
		p1.setWeight(weight);
		p1.setModelno(modelno);
		System.out.println(p1);
		p1.engine();
		p1.gears();
		p1.wheelno();
		p1.seats();
		sc.close();
	}

}
