package abstraction;

import java.util.Scanner;

public class BikeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pulsor p = new Pulsor();
		System.out.println("enter the bike details:brand,color,price");
		String brand = sc.next();
		String color = sc.next();
		int price = sc.nextInt();
		p.setBikeData(color, brand, price);
		System.out.println("enter the pulsor details: engine,modelNo");
		String engine = sc.next();
		String modelNo = sc.next();
		String payment = sc.next();
		p.setPulsorData(engine, modelNo, payment);

		p.display();
		p.discount();
		p.wheelNo();
		p.mirror();
		p.gears();
		p.features();
		p.seatNo();
		Activa a = new Activa();
		System.out.println("enter the bike details:brand,color,price");

		 brand = sc.next();
		 color = sc.next();
		 price = sc.nextInt();

		a.setBikeData(color, brand, price);
		System.out.println("entert the details of Activa: engine,modelno");
		String engines = sc.next();
		String modelno = sc.next();
		String payments = sc.next();
		a.setActivaData(engines, modelno, payments);
		a.display();
		a.discount();
		a.wheelNo();
		a.mirror();
		a.gears();
		a.features();
		a.seatNo();
		sc.close();

	}

}
