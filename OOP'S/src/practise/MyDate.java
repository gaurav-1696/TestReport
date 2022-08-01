package practise;

public class MyDate {
int date,month,year;
MyDate(int date,int month,int year )
{
	this.date=date;
	this.month=month;
	this.year=year;
}
public String toString()
{
	return date+" /"+month+" /"+year;
}
}
