package treeMap;

import java.util.Comparator;

public class Bike2 implements Comparator<Bike2> {
String name,brand;
int id;
public Bike2( int id,String brand, String name) {
	super();
	this.id = id;
	this.brand = brand;
	this.name = name;
	
	
}
@Override
public String toString() {
	return id + " "+ brand + " " + name ;
}
//public int compareTo(Bike2 b)
//{
//	return this.id-b.id;
//// 	return this.name.compareTo(b.name);
//}
//public boolean equals(Object e)
//{
//	Bike2 b=(Bike2)e;
//	if(this.id==b.id)
//	return true;
//	else
//		return false;
//}
@Override
public int compare(Bike2 o1, Bike2 o2) {
	// TODO Auto-generated method stub
	return 0;
}

}
