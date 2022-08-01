package practise;

public class Industry extends Employeee{
String cname,add;
int noOfEmployee;

void setData(String cname,String add,int noOfEmployee)
		
{
	this.cname=cname;
	this.add=add;
	this.noOfEmployee=noOfEmployee;
	
}
public String toString()
{
	return cname+"| "+add+"| "+noOfEmployee+"| "+name+"| "+salary;
}
void display()
{
	
	System.out.println("1 NO IT Company");
}

}
