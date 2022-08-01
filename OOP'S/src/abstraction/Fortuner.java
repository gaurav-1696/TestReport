package abstraction;

public class Fortuner extends Car {
	 void noOfSeats()
	   {
		   System.out.println("innova has 7 seats");		   
	   }
	   void dashBoard()
	   {
		   System.out.println("Music system,Screen,charging ,pendrive");
	   }
	   void engine()
	   {
		   System.out.println("2.8L");
	   }
	   public String toString()
	   {
		   return "Fortuner"+" "+brand+" "+price;
	   }
}