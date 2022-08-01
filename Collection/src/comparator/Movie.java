package comparator;

public class Movie implements Comparable<Movie>{
int idm,boxOfficeCollection,rating;
String movieName;
Movie(int idm,String movieName,int rating,int boxOfficeCollection)
{
	this.idm=idm;
	this.movieName=movieName;
	this.rating=rating;
	this.boxOfficeCollection=boxOfficeCollection;
}
public String toString()
{
	return idm+" "+movieName+" "+rating+" "+boxOfficeCollection;
}
@Override
public int compareTo(Movie o) {
	if(this.rating==o.rating)
	{
		return 1;
	}
	else if(this.rating<o.rating)
		
	{
		return -1;
	}
	else
	{
		if(this.idm>o.idm)
		{
			return 1;
		}
		else if(this.idm<o.idm)
		{
			return -1;
		}
	}
	return this.movieName.compareTo(o.movieName);
}

}
