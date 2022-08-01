package inheritence;

public class Bike1 {
int price;
String color,milage,brand;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getMilage() {
	return milage;
}
public void setMilage(String milage) {
	this.milage = milage;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String toString()
{
	return brand + " " + milage + " " + price + " " + color;
}

void wheelno() {
	System.out.println("2 wheel");
}

void seats() {
	System.out.println("2 seats");
}
void gears()
{
	System.out.println("4 gears");
}
}
