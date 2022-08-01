 package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListHashMap {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	
	al.add(80);
	al.add(1000);
	al.add(100);
	al.add(80);
	al.add(200);
	al.add(20);
	al.add(1000);
	al.add(80);
	al.add(100);
	al.add(20);
	
	HashMap<Integer, Integer> hm=new HashMap<>();
	for(Integer i:al)
	{
		if(hm.containsKey(i))
		{
			int v=hm.get(i)+1;
			hm.put(i, v);
		}
		else
		{
			hm.put(i, 1);
		}
	}
	System.out.println(hm);	
}
}
