package treeMap;

import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "riya");
		tm.put(67, "Reena");
		tm.put(34, "madhav");
		tm.put(45, "gaurav");
		tm.put(12, "punit");
		tm.put(89, "keshav");
		tm.put(26, "rakshanda");
		tm.put(90, "gauri");
		System.out.println(tm);

		System.out.println(tm.descendingMap());

		System.out.println(tm.ceilingKey(67));// it will return which is greater than 67
		System.out.println(tm.ceilingEntry(67));

		System.out.println(tm.floorKey(67));// return key less than or equal to 105
		System.out.println(tm.floorEntry(67));

		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());

		System.out.println(tm.tailMap(45, true));// start key
		System.out.println(tm.headMap(26));// end key

		System.out.println(tm.subMap(12, true, 90, false));

		System.out.println(tm.higherKey(67));// return key strictly greater than 67

		System.out.println(tm.lowerKey(67));
		System.out.println(tm.lowerEntry(67));

		System.out.println(tm.lastKey());

	}

}
