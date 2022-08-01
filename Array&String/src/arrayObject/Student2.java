package arrayObject;

public class Student2 {
	 int id,marks;
	  String dept,name;
	   
	  Student2(){}
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
	  void setMarks(int marks)
	  {
		  this.marks=marks;
	  }
	  int getMarks()
	  {
		  return marks;
	  }
	  public String toString()
	  {
		  return id+" "+name+" "+dept+" "+marks;
	  }
}
