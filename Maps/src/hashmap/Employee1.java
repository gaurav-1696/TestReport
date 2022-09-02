package hashmap;

public class Employee1 {
int id;
String name,dept;
public Employee1(String dept,  String name, int id) {
	this.id = id;
	this.name = name;
	this.dept = dept;
}
@Override
public String toString() {
	return  id + " " + name +" "+ dept ;
}
public int hashCode()
{
	return id;
}
public boolean equals(Object o)
{
	Employee1 e=(Employee1)o;
	if(this.id==e.id)
	return true;
	else
		return false;
	
}

}
