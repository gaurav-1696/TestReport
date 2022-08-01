package arrayObject;

public class Employees {
	 int id,salary;
	  String dept,name,location;
	Employees(int id,String name,String dept,int salary,String location)
	  {
		  this.id=id;
		  this.name=name;
		  this.dept=dept;
		  this.salary=salary;
		  this.location=location;
	  }
	 public String toString()
	  {
		  return id+" "+name+" "+dept+" "+salary+" "+location;
	  }
}
