package constructer;

public class Student {
int id,marks;
String name;

Student(){
	id=1;
	marks=1;
	name="ggg";
}
Student(int id,String name,int marks)
{
	this.id=id;
	this.name=name;
	this.marks=marks;
	
}
public String toString()
{
	return id+" "+name+" "+marks+" ";
}
public static void main(String[] args) {
	Student s1=new Student();
 System.out.println(s1);
Student s2=new Student(101,"gj",70);
	System.out.println(s2);
}
}
