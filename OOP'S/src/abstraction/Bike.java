package abstraction;

public abstract class Bike {
 int price;
 String color,brand;
 void setBikeData(String color,String brand,int price)
 {
	 this.brand=brand;
	 this.color=color;
	 this.price=price;
 }
 void display() {
	 
	 System.out.println(brand+" "+color+" "+price);
 }
 void wheelNo()
 {
	 System.out.println("two wheels");
 }
 void mirror()
 {
	 System.out.println("2 mirrors");
 }
 abstract void  gears();
 abstract void  features();
 abstract void seatNo();
 abstract void discount();
}
