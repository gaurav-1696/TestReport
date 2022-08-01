package multilevelInheritence;

public class Employee extends Person {
int id,salary;
String department;
void setEmployeeData(int id,String department,int salary)
{
	this.id=id;
	this.salary=salary;
	this.department=department;
}
void pf()
{
	int p=salary*15/100;
	System.out.println("PF: "+p);
}
void display()
{
	super.display();
	System.out.println(id+" "+salary+" "+department);
}
}
