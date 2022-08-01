package multilevelInheritence;

public class Student extends Person {
  int id,percent;
  String department;
  void setStudentData(int id,int percent,String department)
  {
	  this.id=id;
	  this.percent=percent;
	  this.department=department;
  }
 
  void grade()
  {
	  if(percent>85)
	  {
		  System.out.println("Garde: A");
	  }
	  else if(percent>70)
	  {
		  System.out.println("Grade: B");
	  }
	  else if(percent>50)
	  {
		  System.out.println("Grade: C");
	  }
  }
  void display()
  {
	  super.display();
	  System.out.println(id+" "+percent+" "+department);
  }
}
