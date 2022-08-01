package polymorphism;

public class Company {
int idc;
String cname,year;
Car1 s;
Company(int idc,String cname,String year,Car1 s)
{
	this.idc=idc;
	this.cname=cname;
	this.year=year;
	this.s=s;
}
public String toString()
{
	return idc+" "+cname+" "+year+" "+s;
}
}
