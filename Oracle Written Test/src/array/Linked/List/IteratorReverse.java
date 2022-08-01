package array.Linked.List;
import java.util.LinkedList;
import java.util.Iterator;
public class IteratorReverse {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		
		Iterator i=al.descendingIterator();
		System.out.println("reverse");
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
		
	}

}
