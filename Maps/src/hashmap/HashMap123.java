package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap123 {
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
	
	System.out.println("hashmap "+hm);
	LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();  //retain the order of insertion
	
	lhm.put(10, "gaurav");
	lhm.put(102, "integer");
	lhm.put(103, "string");
	lhm.put(169, "put");
	lhm.put(106, "not");
	lhm.put(109, "Not");
	lhm.put(179, "sure");
	lhm.put(111, "only");
	lhm.put(142, "allowed");
	lhm.put(125, "acer");
	
	System.out.println("linkedhashmap "+lhm);
	
	TreeMap<Integer, String> t=new TreeMap<>();  //Ascending output
	t.put(112, "gaurav");
	t.put(102, "integer");
	t.put(103, "string");
	t.put(15, "put");
	t.put(106, "not");
	t.put(109, "Not");
	t.put(13, "sure");
	t.put(111, "only");
	t.put(142, "allowed");
	t.put(125, "acer");
	
	System.out.println("treemap "+t);
}
}
