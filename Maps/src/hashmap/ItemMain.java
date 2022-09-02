 package hashmap;

import java.util.ArrayList;
import java.util.HashMap;


public class ItemMain {
public static void main(String[] args) {
	ArrayList<Item> al=new ArrayList<Item>();
	al.add(new Item(1021,"20-20","Nestle",10));
	al.add(new Item(458,"MarriGold","Britannia",30));
	al.add(new Item(896,"Maggi","Nestle",14));
	al.add(new Item(27,"SoysStick","Balaji",10));
	al.add(new Item(963,"HappyHappy","Parle-G",5));
	al.add(new Item(632,"20-20","Parle-G",10));
	al.add(new Item(4,"MarriLite","Britannia",30));
	al.add(new Item(26,"CreamAnOnion","Balaji",10));
	
	System.out.println(al);
	System.out.println("---------------------");
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	for(Item c:al)
	{
		if(hm.containsKey(c.company))
		{
			int i=hm.get(c.company)+1;
			hm.put(c.company, i);
		}
		else
		{
			hm.put(c.company, 1);
		}
	}
	System.out.println(hm);
	System.out.println("------------------------");
	for(Item d:al)
	{
		if(hm.containsKey(d.name))
		{
			int f=hm.get(d.name)+1;
			hm.put(d.name, f);
		}
		else
		{
			hm.put(d.name, 1);
		}
	}
	System.out.println(hm);
	
}
}
