package comparable;

public class Student implements Comparable<Student> {
int id,marks;
String name,dept;
Student(int id,String name,String dept,int marks)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.marks=marks;
}
public String toString()
{
	return id+" "+name+" "+dept+" "+marks;
}
 
public int compareTo(Student o) {
	{
		if(this.dept.equals(dept))
		{
		if(this.marks>o.marks)
		{
		return 1;
		}
		else if(this.marks<o.marks)
		{
			return -1;
		}
		
		else
		{
			//1)using id
			return this.id-o.id;
			//2)using name
			//return this.name.compareTo(o.name);
		}
	}
	else
	{
		return this.dept.compareTo(o.dept);
	}
		
}
}
}


