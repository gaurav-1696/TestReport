package set;

import java.util.LinkedList;

public class EX2_CombinedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> listl=new LinkedList<Integer>();
listl.add(1);
listl.add(2);
listl.add(3);
listl.add(4);
listl.add(5);
listl.add(6);
System.out.println(listl);

LinkedList<Integer> list2=new LinkedList<Integer>();
list2.add(11);
list2.add(22);
list2.add(33);
list2.add(44);
System.out.println(list2);

LinkedList<Integer> list3=new LinkedList<Integer>();
for(int i=0;i<listl.size();i++)
{
	list3.add(listl.get(i));
	if(i<list2.size())
	{
		list3.add(list2.get(i));
	}
}
System.out.println(list3);
	}

}
