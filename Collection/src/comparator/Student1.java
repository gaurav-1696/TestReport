package comparator;

public class Student1 {
	int id,marks;
	String name,dept;
	Student1(int id,String name,String dept,int marks)
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
}
