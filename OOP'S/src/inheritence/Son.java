package inheritence;

public class Son extends Father {
String sfirstName;
void setSonData(String sfirstName)
{
	this.sfirstName=sfirstName;
}
public void display()
{
	super.display();
	System.out.println(sfirstName+" "+super.ffirstName+" "+lastName);
}
}
