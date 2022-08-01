package classesObjects;

import java.util.Scanner;

public class Cars {
  int id,year,price,installment,discount;
  String name,brandname,mpay;
  void setData(int i,String n,int y,int p,String b,int e,String r)
  {
	  id=i;
	  name=n;
	  year=y;
	  price=p;
	  brandname=b;
	  installment=e;
	 mpay=r;
	 
  }
    
  void discount()
  {
	if(mpay.equals("cash") && installment==0)
	    {
		int discount=price*18/100;
	int	netamt= price-discount;
	System.out.println("After discount "+netamt);
	  }
	else if(mpay.equals("online") && installment==0)
	{
		int discount=price*12/100;
		int netamt=price-discount;
		System.out.println("After discount "+netamt);
	}
	else if(installment==2)
	{
		discount=price*9/100;
		int netamt=price-discount;
		System.out.println("After discount "+netamt);
		
	}
	else if(installment==3)
	{
		discount=price*5/100;
		int netamt=price-discount;
		System.out.println("After discout "+netamt);
	}
  }
   public String toString()
   {
	   return id+" "+name+" "+year+" "+price+" "+brandname+" ";
   }
  public static void main(String[] args) {
	int id,year,price,installment;
	String name,brandname,mpay;
	Cars c1=new Cars();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id,name,year,price,brandname,installment,mpay");
	id=sc.nextInt();
	name=sc.next();
	year=sc.nextInt();
	price=sc.nextInt();
	brandname=sc.next();
	installment=sc.nextInt();
	mpay=sc.next();
	
	  c1.setData(id, name, year, price, brandname,installment,mpay);
	  System.out.println(c1);
	  c1.discount();
	  
	  sc.close();
}
  
}
