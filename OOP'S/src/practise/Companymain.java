package practise;

import java.util.Scanner;

public class Companymain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the car detail: id,name,model,price");
	int id=sc.nextInt();
	String name=sc.next();
	String model=sc.next();
	int price=sc.nextInt();
	Car s=new Car(id,name,model,price);
	System.out.println("Car Details are:");
	System.out.println(s);
	System.out.println("enter the companydetails:");
	int idc=sc.nextInt();
	String cname=sc.next();
	String year=sc.next();
	 Company n=new Company(idc,cname,year,s);
	 System.out.println("company details are:");
	 System.out.println(n);
	 sc.close();
}
}
