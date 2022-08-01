package containment;

import java.util.Scanner;

public class ActorMovieMain {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Movie m[]=new Movie[2];
	for(int i=0;i<2;i++)
	{
		System.out.println("enter id,moviename,boxofficecollection");
		int id=sc.nextInt();
		String moviename=sc.next();
		int boxofficecollection=sc.nextInt();
		Actor actor[]=new Actor[2];
		
		for(int j=0;j<2;j++)
		{
			System.out.println("enter the id,name,birthdate,address");
			String ida=sc.next();
			String name=sc.next();
			String birthdate=sc.next();
			String address=sc.next();
			
			Actor s= new Actor();
			s.setIda(ida);
			s.setName(name);
			s.setBirthdate(birthdate);
			s.setAddress(address);
			
			actor[j]=s;
			
		}
		Movie x=new Movie();
		x.setId(id);
		x.setMoviename(moviename);
		x.setBoxofficecollection(boxofficecollection);
		x.setActor(actor);
		m[i]=x;
		
	}
	for(Movie r:m)
	{
		for(Actor x:r.actor)
		{
			if(x.getName().equals("salmankhan") && r.getBoxofficecollection()>5000000)
			{
				System.out.println(x.ida+" "+r.boxofficecollection+" "+r.moviename+" "+x.name+" "+x.birthdate+" "+x.address);
			}
		}
	}
	sc.close();
}
}
