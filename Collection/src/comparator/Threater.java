package comparator;
import java.util.ArrayList;
public class Threater {
int id;
String name;
ArrayList<Movie> m;
Threater(int id,String name,ArrayList<Movie> m)
{
	this.id=id;
	this.name=name;
	this.m=m;
}
public String toString()
{
	return id+" "+name+" "+m;
}
}
