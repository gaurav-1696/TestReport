package treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CarMainUsingIterator {
public static void main(String[] args) {
	TreeMap<Integer, Car> tm=new TreeMap<>();
	tm.put(761, new Car("NexonEV","Tata",1500000,2021));
	tm.put(102, new Car("Seltos","KIA",1750000,2020));
	tm.put(302, new Car("Thar","Mahindra",1800000,2021));
	tm.put(410, new Car("Harrier","Tata",2300000,2020));
	tm.put(2561, new Car("InnovaCrysta","Toyota",2500000,2021));
	
	//traversing map
	System.out.println("-------using key---------");
	for(Integer i:tm.keySet())
	{
		System.out.println(i);
	}
	System.out.println("------using value------");
	for(Car s:tm.values())
	{
		System.out.println(s);
	}
	System.out.println("---------------");
	for(Map.Entry<Integer, Car> entry:tm.entrySet())
    {
	System.out.println(entry.getKey()+" "+entry.getValue());
    }
	System.out.println();
	System.out.println("-------using iterator-------");
	Set a=tm.entrySet();
	Iterator itr=a.iterator();
	//Iterator itr=tm.entrySet().iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//using map.entry
	System.out.println("-----map.entry iterator--------");
	Iterator<Map.Entry<Integer, Car>> map=tm.entrySet().iterator();
	while(map.hasNext())
	{
		Map.Entry<Integer, Car> t=map.next();
		System.out.println(t.getKey()+" "+t.getValue());
	}
}
}
