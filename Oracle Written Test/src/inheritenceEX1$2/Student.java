package inheritenceEX1$2;

public class Student {
int id,marks;
String name,contact,address;
void setStudentData(int id,int marks,String name,String contact,String address)
{
	this.id=id;
	this.name=name;
	this.marks=marks;
	this.contact=contact;
	this.address=address;
}
public String toString()
{
	return id+" "+name+" "+marks+" "+contact+" "+address;
}
}
