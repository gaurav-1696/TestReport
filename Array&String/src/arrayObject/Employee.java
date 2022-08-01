package arrayObject;

public class Employee {
	 int id,salary;
	  String dept,name,location;
	   
	  Employee(){}
	  void setID(int id)
	  {
		  this.id=id;
	  }
	  int getId()
	  {
		  return id;
	  }
	  void setName(String name)
	  {
		  this.name=name;
	  }
	  String getName()
	  {
		  return name;
	  }
	  void setDept(String dept)
	  {
		  this.dept=dept;
	  }
	  String getDept()
	  {
		  return dept;
	  }
	  void setSalary(int salary)
	  {
		this.salary=salary;
	  }
	  int getSalary()
	  {
		  return salary;
	  }
	  void setLocation (String location)
	  {
		  this.location=location;
	  }
	  String getLocation()
	  {
		  return location;
	  }
	  public String toString()
	  {
		  return id+" "+name+" "+dept+" "+salary+" "+location;
	  }
}


