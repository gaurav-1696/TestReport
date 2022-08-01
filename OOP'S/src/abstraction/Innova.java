package abstraction;

public class Innova extends Car {
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
	   System.out.println("2.4L");
   }  
   public String toString()
   {
	   return "Innova"+" "+brand+" "+price;
   }
}
