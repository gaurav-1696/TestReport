package abstraction;

public class Pulsor extends Bike {
String engine,modelNo,payment;
void setPulsorData(String engine, String modelNo,String payment)
{
	this.engine=engine;
	this.modelNo=modelNo;
	this.payment=payment;
}
void display()
{
	super.display();
	System.out.println(engine+" "+modelNo+" "+payment);
}
void gears()
{
	System.out.println("Pulsor Having 5 gears");
}
void features()
{
	System.out.println("digital instrument cluster");
}
void seatNo()
{
	System.out.println("Pulsor having 2 seats");
}
void discount()
{
	if(payment.equals("full"))
	{
		 int d=price*18/100;
		 System.out.println("Discount you got: "+d);
	}
	else if(payment.equals("half"))
	{
		 int d=price*11/100;
		 System.out.println("Discount you got: "+d);
	}
}

}
