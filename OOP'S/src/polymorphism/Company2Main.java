package polymorphism;

import java.util.Scanner;

public class Company2Main {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	/*
	 * System.out.println("enter car id,name,model,price"); int id=sc.nextInt();
	 * String name=sc.next(); String model=sc.next(); int price=sc.nextInt(); Car2
	 * e=new Car2(); e.setId(id); e.setName(name); e.setModel(model); e.setPr
	 ice(price);*/
	
	System.out.println("enter car id,name,model,price");
	int id=sc.nextInt();
	String name=sc.next();
	String model=sc.next();
	//int price=sc.nextInt();
	Car2 e=new Car2();
	e.setId(id);
	e.setModel(model);
	e.setName(name);
	System.out.println("enter cid,name,year");
	int idc=sc.nextInt();
	 String cname=sc.next();         
	 String year=sc.next();
	 Company2 v=new Company2();
	 v.setIdc(idc);
	 v.setCname(cname);
	 v.setYear(year);
	 v.setE(e);
	 System.out.println(v);
	 System.out.println("**************");
	 Company2 v2=new Company2();
	 v2.setIdc(idc);
	 v2.setCname(cname);
	 v2.setYear(year);
	 v2.setE(e);
	 System.out.println(v2);
	 System.out.println("*********************");
	 Company2 v3=new Company2();
	 v3.setIdc(idc);
	 v3.setCname(cname);
	 v3.setYear(year);
	 v3.setE(e);
	 System.out.println(v3);
	 System.out.println("***********");
	 Company2 v4=new Company2();
	 v4.setIdc(idc);
	 v4.setCname(cname);
	 v4.setYear(year);
	 v4.setE(e);
	 System.out.println(v4);
	 System.out.println("***********************");
	 Company2 v5=new Company2();
	 v5.setIdc(idc);
	 v5.setCname(cname);
	 v5.setYear(year);
	 v5.setE(e);
	 System.out.println(v5);
	 sc.close();
}
}
