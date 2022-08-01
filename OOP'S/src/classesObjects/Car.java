package classesObjects;

public class Car {
  void wheelNo()
  {
	  System.out.println("4 wheel");
  }
  void dashBoard()
  {
	  System.out.println("Compulsory for each car");
  }
  void engineCapacity()
  {
	  System.out.println("1500cc");
  }
  void milege()
  {
	  System.out.println("milege:18 km/ltr");
  }
  public static void main(String[] args) {
	
	  Car c1=new Car();
	  Car c2=new Car();
	  Car c3=new Car();
	  
	  System.out.println("First Car");
	  c1.wheelNo();
	  c1.dashBoard();
	  c1.engineCapacity();
	  c1.milege();
	  
	  System.out.println("second car");
	  c2.wheelNo();
	  c2.dashBoard();
	  c2.engineCapacity();
	  c2.milege();
	  
	  System.out.println("Third car");
	  c3.wheelNo();
	  c3.dashBoard();
	  c3.engineCapacity();
	  c3.milege();	  
}
}
