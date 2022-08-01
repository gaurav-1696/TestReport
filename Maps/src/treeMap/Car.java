package treeMap;

public class Car {
String name,brand;
int price,year;
public Car(String name, String brand, int price,int year) {
	super();
	this.name = name;
	this.brand = brand;
	this.price = price;
	this.year = year;
}
@Override
public String toString() {
	return  name + " "+ brand + " " + price + " " + year;
}


}
