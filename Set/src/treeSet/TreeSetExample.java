package treeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
	static void traverseSet(TreeSet<Integer> hs)
	{
		for(Integer i:hs)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(10);
		hs.add(150);
		hs.add(80);
		hs.add(900);
		hs.add(56);
		hs.add(10);
		hs.add(52);
		traverseSet(hs);
	}
}
