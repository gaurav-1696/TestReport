package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderMain {
public static void main(String[] args) {
	ArrayList<Order> s=new ArrayList<>();
	s.add(new Order(04,510,"mumbai","pending"));
	s.add(new Order(15,154,"nashik","Completed"));
	s.add(new Order(14,236,"pune","pending"));
	s.add(new Order(06,253,"thane","pending"));
	s.add(new Order(03,194,"mumbai","pending"));
	s.add(new Order(07,120,"kalyan","Completed"));
	System.out.println(s);
	HashMap<String,Integer> h=new HashMap<>();
	for(Order c:s)
	{
		if(c.status.equals("pending"))
		{
			if(h.containsKey(c.city))
			{
				int r=h.get(c.city)+1;
				h.put(c.city,r );
			}
		
		else
		 {
			h.put(c.city, 1);
		 }
		}
	}
	System.out.println(h);
		
}
}
