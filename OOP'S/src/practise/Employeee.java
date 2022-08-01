package practise;

public class Employeee {
  int id,salary;
  String name,contact;
  void SetEdata(int id,String name,int salary,String contact)
  {
	  this.contact=contact;
	  this.id=id;
	  this.name=name;
	  this.salary=salary; 
  }
  public String toString()
  {
	  return id+" "+name+" "+salary+" "+contact;
  }
  void display()
  {
	  System.out.println("Software Employee");
  }
}
