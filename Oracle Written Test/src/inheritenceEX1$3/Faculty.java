package inheritenceEX1$3;

public class Faculty extends Person{
	int id,salary;
	  String subject;
	  void setFacultyData(int id,int salary,String subject)
	  {
		  this.id=id;
		  this.salary=salary;
		  this.subject=subject;
		 
	  }
	  public String toString()
	  {
		  return id+" "+name+" "+subject+" "+salary;
	  }
}
