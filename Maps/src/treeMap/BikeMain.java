package treeMap;

import java.util.Iterator;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BikeMain {
public static void main(String[] args) {
	TreeMap<Bike, Integer> b=new TreeMap<>();
	b.put(new Bike(121,"Bajaj","Pulsor"),125000);
	b.put(new Bike(1696,"Hero","Splendor"), 90000);
	b.put(new Bike(456,"MT15","Yamaha"), 145000);
	b.put(new Bike(78,"FZ-S","Yamaha"),135000);
	
	System.out.println(b);
	System.out.println("-------using key---------");
	for(Bike i:b.keySet())
	{
		System.out.println(i);
	}
	System.out.println("------using value------");
	for(Integer s:b.values())
	{
		System.out.println(s);
	}
	System.out.println("---------------");
	for(Entry<Bike, Integer> entry:b.entrySet())
    {
	System.out.println(entry.getKey()+" "+entry.getValue());
    }
	System.out.println("-----------------------------");
	System.out.println("using iterator");
//	Set a=b.entrySet();
	//Iterator itr=a.iterator();
	Iterator<Entry<Bike, Integer>> itr=b.entrySet().iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//using map.entry
	System.out.println("-------------");
	Iterator<Entry<Bike, Integer>> map=b.entrySet().iterator();
	while(map.hasNext())
	{
		Entry<Bike, Integer> t=map.next();
		System.out.println(t.getKey()+" "+t.getValue());
	}
}
}
