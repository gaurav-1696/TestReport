package containment;

public class Actor1 {
	int ida;
String name,birthDate,address;


public int getIda()
{
	return ida;
}
public void setIda(int ida)
{
	this.ida=ida;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public String getBirthDate()
{
	return birthDate;
}
public void setBirthDate(String birthDate)
{
	this.birthDate=birthDate;
}
public String getAddress()
{
	return address;
}
public void setAddress(String address)
{
	this.address=address;
}
public String toString()
{
return ida+" "+name+" "+birthDate+" "+address;
}
}
