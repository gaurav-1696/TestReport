package array.Linked.List;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class XobinTest {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		al.add(sc.nextInt());
	}
System.out.println("------------------");
for(int i=0;i<al.size()-1;i++)
{
	if(al.get(i)%2==0)
	{
		al.remove(i);
	}
	System.out.print(al.get(i)+" ");
}
System.out.println("------------------------");
	ArrayList<Integer> a=new ArrayList<Integer>();
	for(Integer i:al)
	{
		if(i%2!=0)
		{
			a.add(i);
		}
	}
	for(Integer i:a)
	{
		System.out.print(i+" "); 
	}
//	Iterator<Integer> itr=a.iterator();
//	
//	while(itr.hasNext())
//	{
//		int g=itr.next();
//		System.out.print(g+" ");
//	}
	
	sc.close();
}
}
