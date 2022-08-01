package array.Linked.List;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(5);
		al.add(6);
		Iterator<Integer> i = al.iterator();

		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			al.add(20);
		}

		/*
		 * for(Integer d:al) { if(d==2) { al.add(20); } }
		 */
	}

}
