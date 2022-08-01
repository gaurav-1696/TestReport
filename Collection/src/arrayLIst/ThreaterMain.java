package arrayLIst;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreaterMain {

	public static void main(String[] args) {
		ArrayList<Threater> t=new ArrayList<>();
		
	 t.add(new Threater(101, "inox", 3, 2000000));
	 t.add(new Threater(102, "Elpro", 4, 4500000));
	 t.add(new Threater(102, "iCinemax", 4, 4500560));
	 t.add(new Threater(102, "Elpro", 4, 4500000));
	System.out.println(t);
	
	Threater a[]=new Threater[t.size()];
	t.toArray(a);
	System.out.println("object array: "+Arrays.toString(a));
	
	for(Threater s:a)
	{
		if(s.name.startsWith("i"))
		{
			System.out.println(s.name+" "+s.collection);
		}
	}
	
	}

}
