package comparator;
import java.util.ArrayList;
import java.util.Scanner;
public class ThreaterMain {

	public static void main(String[] args) {
		
  ArrayList<Threater> t=new ArrayList<>();
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  for(int i=0;i<size;i++)
  {
	System.out.println("enter the threater details");
	int id=sc.nextInt();
	String name=sc.next();
	 
	ArrayList<Movie> m=new ArrayList<>();
	for(int j=0;j<4;j++)
	{
		System.out.println("enter the movie id,name,rating,boxofficecollection");
		int idm=sc.nextInt();
		String movieName=sc.next();
		int rating=sc.nextInt();
		int boxOfficeCollection=sc.nextInt();
		m.add(new Movie(idm,movieName,rating,boxOfficeCollection));
		
		}
	t.add(new Threater(id,name,m));
}
System.out.println(t);
	sc.close();
	}

}
