package practise;

public class Company {
int cid;
String cname,year;
Car s;
Company(int cid,String cname,String year,Car s)
{
	this.cid=cid;
	this.cname=cname;
	this.year=year;
	this.s=s;
}
public String toString()
{
	return cid+" "+cname+" "+year+" "+s;
}
}
