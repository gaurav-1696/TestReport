package multilevelInheritence;

import java.util.Scanner;

public class CarMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name,brandName,launchyr,price");
	String name=sc.next();
	String brandName=sc.next();
	int launchYr=sc.nextInt();
	int price=sc.nextInt();
	Skoda s=new Skoda();
	s.setData(name, brandName, launchYr, price);
	System.out.println("enter the id,modelno,paymentmode, installment");
	int id=sc.nextInt();
	String modelNo=sc.next();
	String modeOfPayment=sc.next();
	int installment=sc.nextInt();
	s.setData1(id, modelNo, modeOfPayment, installment);
	s.display();
	s.discount();
	sc.close();
}
}
