package treeMap;

public class Bike implements Comparable<Bike> {
String name,brand;
int id;
public Bike( int id,String brand, String name) {
	super();
	this.id = id;
	this.brand = brand;
	this.name = name;
	
	
}
@Override
public String toString() {
	return id + " "+ brand + " " + name ;
}
public int compareTo(Bike b)
{
	return this.id-b.id;
// 	return this.name.compareTo(b.name);
}
public boolean equals(Object e)
{
	Bike b=(Bike)e;
	if(this.id==b.id)
	return true;
	else
		return false;
}

}
