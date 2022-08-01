package practise;

import java.util.Scanner;

public class CompanysMain {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the car details:");
	int id=sc.nextInt();
	String name=sc.next();
	String model=sc.next();
	int price=sc.nextInt();
	Cars s=new Cars();
	s.setId(id);
	s.setName(name);
	s.setModel(model);
	s.setPrice(price);
	System.out.println(s);
	System.out.println("enter the company details");
	int idv=sc.nextInt();
	String cname=sc.next();
	String year=sc.next();
	Companys c=new Companys();
	c.setIdv(idv);
	c.setCname(cname);
	c.setYear(year);
	c.setS(s);
	System.out.println(c);
	sc.close();
}
}
