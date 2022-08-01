package polymorphism;

public class Car1 {
int id,price;
String name,model;
Car1(int id,String name,String model,int price)
{
	this.id=id;
	this.name=name;
	this.model=model;
	this.price=price;
}
public String toString()
{
	return id+" "+name+" "+model+" "+price;
}
		
}
