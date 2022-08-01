package hashset;

import java.util.HashSet;
public class SetExample {

static void traverseSet(HashSet<Integer> hs)
{
	for(Integer i:hs)
	{
		System.out.println(i);
	}
}
static void average(HashSet<Integer> hs)
{
	int sum=0;
	for(Integer i:hs)
	{
		 sum=sum+i;
	}
	System.out.println("avegare: "+sum/hs.size());
}
public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(150);
	hs.add(80);
	hs.add(900);
	hs.add(56);
	hs.add(10);
	hs.add(52);
	traverseSet(hs);
	average(hs);
}
}
