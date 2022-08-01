package treemapp;

import java.util.TreeMap;

public class EX3_SerachKey implements Comparable<EX3_SerachKey> {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
	tm.put(10, "Gaurav");
	tm.put(11, "Gauri");
	tm.put(42, "Madhura");
	tm.put(5, "Harshada");
	tm.put(56,"chinmay");
	System.out.println(tm);
	//search keys
	//System.out.println(tm.get(tm));
	
}
@Override
public int compareTo(EX3_SerachKey o) {
	
	return 0; 
}
}
