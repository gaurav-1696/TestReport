package abstraction;

public class Activa extends Bike {
String engines,modelno,payments;
void setActivaData(String engines,String modelno,String payments)
{
	this.engines=engines;
	this.modelno=modelno;
	this.payments=payments;
}
void display()
{
	super.display();
	System.out.println(engines+" "+modelno);
}
void wheelNo()
{
	 System.out.println("two wheels");
}
void mirror()
{
	 System.out.println("2 mirrors");
}
void gears()
{
	System.out.println("Activa Having  no gears");
}
void features()
{
	System.out.println("charging point");
}
void seatNo()
{
	System.out.println("Activa having 2 seats");
}
void discount()
{
	if(payments.equals("full"))
	{
		 int d=price*18/100;
		 System.out.println("Discount you got: "+d);
	}
	else if(payments.equals("half"))
	{
		 int d=price*11/100;
		 System.out.println("Discount you got: "+d);
	}
}
}
