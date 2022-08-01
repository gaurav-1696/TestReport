package classesObjects;

public class Discount {
   int discount,price;
   void discount(int installment ,String payment) 
   
   {
	   if(payment.equals("cash") && installment==0)
	    {
		int discount=price*18/100;
	int	netamt= price-discount;
	System.out.println("After discount "+netamt);
	  }
	else if(payment.equals("online") && installment==0)
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
   }

