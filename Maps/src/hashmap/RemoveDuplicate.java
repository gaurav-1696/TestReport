package hashmap;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	al.add(10);
	al.add(15);
	al.add(10);
	al.add(20);
	al.add(25);
	al.add(15);
	al.add(30);
	al.add(15);
	System.out.println("just printing:- " +al);
	
	ArrayList<Integer> a=new ArrayList<>();
	for(int i=0;i<al.size();i++)
	{
		int count =0;
		for(int j=0;j<al.size();j++)
		{
			if(al.get(i)==al.get(j)&& j<i)
			{
				break;
			}
			else if(al.get(i)==al.get(j) && j>=i)
			{
				count++;
			}
		}
		if(count!=0)
		{
			a.add(al.get(i));
		}
	}
	System.out.println("after removing duplicate entries:-");
		Iterator<Integer> itr=a.iterator();
	while(itr.hasNext())
	{
		int g=itr.next();
 		System.out.print(g+" ");
	}	
}
}
