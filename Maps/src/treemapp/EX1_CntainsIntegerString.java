package treemapp;

import java.util.TreeMap;

public class EX1_CntainsIntegerString {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
	tm.put(10, "Gaurav");
	tm.put(11, "Gauri");
	tm.put(42, "Madhura");
	tm.put(5, "Harshada");
	tm.put(56,"chinmay");
	System.out.println(tm);
}
}
