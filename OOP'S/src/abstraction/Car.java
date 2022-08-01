package abstraction;

public  abstract class Car {
	int price;
	String brand;
	void setData(int price,String brand)
	{
		this.brand=brand;
		this.price=price;
	}
   void wheelno()
   {
	   System.out.println("4 wheels");
   }
   void gears()
   {
	   System.out.println("5 gears");
   }
   abstract void noOfSeats();
   abstract void dashBoard();
   abstract void engine();
}