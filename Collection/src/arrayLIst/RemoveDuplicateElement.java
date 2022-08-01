package arrayLIst;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(9);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(9);
		al.add(5);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		for(int i=0; i<al.size(); i++)
		{
			int cnt=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i)==al.get(i)&&j<i)
				{
					break;
				}
				else if(al.get(i)==al.get(j)&&j>=i)
				{
					cnt++;
				}
			}
			if(cnt!=0)
			{
				al1.add(al.get(i));
			}
		}
		
		Iterator<Integer> itr=al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
