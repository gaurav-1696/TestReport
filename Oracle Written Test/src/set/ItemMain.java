package set;
import java.util.ArrayList;
import java.util.HashMap;

public class ItemMain {
public static void main(String[] args) {
	ArrayList<Item> al=new ArrayList<Item>();
	al.add(new Item(123,"parleG",10.00,4));
	al.add(new Item(5015,"GoodDay",5.00,5));
	al.add(new Item(45,"BlackDates",185.00,5));
	al.add(new Item(123 ,"parleG",10.00,10));
	al.add(new Item(123,"parleG",10.00,4));
	al.add(new Item(5016,"GoodDay",10.00,5));
	al.add(new Item(120,"AmulButter",235.00,5));
	al.add(new Item(41,"BlackDates",133.00,2));
	al.add(new Item(121,"AmulButter",15.00,5));
	//System.out.println(al);
	HashMap<String , Integer> hs=new HashMap<String, Integer>();
	for(Item q:al)
	{
		if(hs.containsKey(q.name))
		{
			int v=hs.get(q.name)+q.qty;
			hs.put(q.name, v);
		}
		else
		{
			hs.put(q.name, q.qty);
		}
	}
	System.out.println(hs);
}
}
