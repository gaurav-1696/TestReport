package Mycode;

public class Student {
int id,salary;
String name,contact;
Student()
{
	id=salary;
	salary=id;
}

Student(int i,int sal,String n,String c)
{
	id=i;
	salary=sal;
	name=n;
	contact=c;
}
void display()
{
	System.out.println(id+" "+name+" "+salary+" "+contact);
}
public static void main(String[] args) {
	//Student s1=new Student(101,523000);
	Student s2=new Student(101,52300,"Gaurav","9145747297");
	//s1.display();
	s2.display();
	
	
}
}
