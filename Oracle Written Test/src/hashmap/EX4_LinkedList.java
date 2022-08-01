package hashmap;

import java.util.HashMap;
import java.util.LinkedList;

public class EX4_LinkedList {
public static void main(String[] args) {
	LinkedList<Integer> al=new LinkedList<>();
	al.add(1);
	al.add(4);
	al.add(2);
	al.add(1);
	al.add(3);
	al.add(1);
	al.add(4);
	System.out.println(al);
	LinkedList<String> ll=new LinkedList<>();
	HashMap<String , Integer> hm=new HashMap<>();
	for(int i=0;i<al.size();i++)
	{
		switch(al.get(i))
		{
			case 1:ll.add("one");
			break;
			case 2:ll.add("two");
			break;
			case 3: ll.add("three");
			break;
			case 4:ll.add("four");
			break;
		}
		
	}
	for(String s:ll)
	{
		if(hm.containsKey(s))
		{
			int c=hm.get(s)+1;
			hm.put(s, c);
		}
		else
		{
			hm.put(s, 1);
		}
	}
	System.out.println(hm);
	
}
}
