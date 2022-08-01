package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMethods {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<>();  //random output
	hm.put(10, "gaurav");
	hm.put(102, "integer");
	hm.put(103, "string");
	hm.put(105, "put");
	hm.put(106, "not");
	hm.put(109, "Not");
	hm.put(123, "sure");
	hm.put(111, "only");
	hm.put(142, "allowed");
	hm.put(125, "acer");
	
	System.out.println(hm.isEmpty());
	System.out.println(hm.get(109));//value of the key
	System.out.println(hm.containsKey(126)); //to check whether present or not
	System.out.println(hm.containsValue("sure"));
	
	System.out.println(hm.hashCode()); //hashcode: native method
	
	hm.remove(109);  //remove key
	System.out.println(hm);
	
	//to clear map
//	hm.clear();
//	System.out.println(hm);
	
	System.out.println(hm.size());
	hm.replace(142, "not allowd");
	System.out.println(hm);
	
	//map adding
	
	HashMap<Integer, String> hm1=new HashMap<>(); 
	 
	hm1.put(1000, "add");
	hm1.put(1002, "done");
	hm1.put(1003, "ok");
	
	hm.putAll(hm1);
	System.out.println(hm);
	
	//traversing map
	for(Integer i:hm.keySet())  //gives only key
	{
		System.out.println(i);
	}
	for(String s:hm.values())    //only values of the map
   	{
		System.out.println(s);
	}
	
	for(Map.Entry<Integer, String> entry: hm.entrySet())
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	System.out.println();
	System.out.println("--------------iterator----------");
	
//	Set s=hm.entrySet();
//	Iterator itr=s.iterator();
	Iterator itr=hm.entrySet().iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println();
	System.out.println("----------iterator using map.entry-------");
	
	Iterator<Map.Entry<Integer, String>> limtr=hm.entrySet().iterator();
	while(limtr.hasNext())
	{
		Map.Entry<Integer, String> ent=limtr.next();
		System.out.println(ent.getKey()+" "+ent.getValue());
	}
}
}
