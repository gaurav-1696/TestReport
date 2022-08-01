package practise;

public class Son extends Father {
String sonName;
void setSonData(String sonName)
{
	this.sonName=sonName;
}
void display()
{
	super.display();
	System.out.println(sonName+" "+super.fatherName+" "+lastName);
}
}
