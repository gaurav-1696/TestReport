package containment;
import java.util.Scanner;
public class ActorMovieMain1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Movie m[]=new Movie[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("enter the id,moviename,boxofficecollection");
			int id=sc.nextInt();
			String movieName=sc.next();
			int boxOficeCollection=sc.nextInt();
			
			Actor actor[]=new Actor[2];
			for(int j=0;j<2;j++)
			{
				System.out.println("enter the id,name,birthdate,address");
				int ida=sc.nextInt();
				String name=sc.next();
				String birthDate=sc.next();
				String address=sc.next();
				
				Actor s=new Actor();
				s.setIda(birthDate);
				s.setName(name);
				s.setBirthdate(birthDate);
				s.setAddress(address);
				
				actor[j]=s;
			}
			Movie x=new Movie();
			x.setId(id);
			x.setMoviename(movieName);
			x.setBoxofficecollection(boxOficeCollection);
			x.setActor(actor);
			m[i]=x;
		}
		for(Movie r:m)
		{
			for(Actor x:r.actor)
			{
				if(x.getName().equals("salmankhan")&& r.getBoxofficecollection()>500000)
				{
					System.out.println(x.ida+" "+r.boxofficecollection+" "+r.moviename+" "+x.name+" "+x.birthdate+" "+x.address);
				}
			}
		}
sc.close();
	}

}
