package hashmap;

public class Bike {
int id;
String name,color;
public Bike(int id, String name, String color) {
	super();
	this.id = id;
	this.name = name;
	this.color = color;
}
public String toString() {
	return id + " " + name + " " + color ;
}
}









//public int hashCode()
//{
//	return id;
//}
//public boolean equals(Object o)
//{
//	Bike e=(Bike)o;
//	if(this.id==e.id)
//	return true;
//	else
//		return false;	
//}

