package classesObjects;

import java.util.Scanner;

public class CarMain {
public static void main(String[] args) {
	
	int id,year,price,installment;
	String name,brandname,payment;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id,name,year,price,brandname,installment,payment");
	id=sc.nextInt();
	name=sc.next();
	year=sc.nextInt();
	price=sc.nextInt();
	brandname=sc.next();
	
	Carr c1=new Carr();
	c1.setId(id);
	c1.SetName(name);
	c1.setPrice(price);
	c1.setYear(year);
	c1.SetName(brandname);
	System.out.println(c1);

  System.out.println(c1);
	Discount c2= new Discount();
	System.out.println("enter installment method ");
	installment=sc.nextInt();
	payment=sc.next();
System.out.println(c2.discount );
	sc.close();
}
}
