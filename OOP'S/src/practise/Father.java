package practise;

public class Father extends GrandFather {
String fatherName;
void setFatherData(String fatherName)
{
	this.fatherName=fatherName;
}
void display()
{
	super.display();
	System.out.println(fatherName+" "+super.firstName+" "+lastName);
}
}
