package arrayLIst;

public class Threater {
int id,noOfMovies,collection;
String name;
Threater(int id,String name,int noOfMovie,int collection)
{
	this.id=id;
	this.name=name;
	this.noOfMovies=noOfMovie;
	this.collection=collection;
}
public String toString()
{
	return id+" "+name+" "+noOfMovies+" "+collection;
}
}
