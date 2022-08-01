package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class EX3_Frequency {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("pune");
	al.add("mumbai");
	al.add("pune");
	al.add("mumbai");
	al.add("nashik");
	al.add("pune");
	
	HashMap<String, Integer> m=new HashMap<>();
	for(String i:al)
	{
		if(m.containsKey(i))
		{
			int v=m.get(i)+1;
			m.put(i,v);
		}
		else
		{
			m.put(i, 1);
		}
	}
	System.out.println(m);
}
}
