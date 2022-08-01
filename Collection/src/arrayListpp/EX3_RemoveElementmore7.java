package arrayListpp;

import java.util.ArrayList;

public class EX3_RemoveElementmore7 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("sunday");
		al.add("monday");
		al.add("tuesday");
		al.add("wensday");
		al.add("thusdat");
		al.add("friday");
		al.add("saturday");
		Object[] ch=al.toArray();
				
		for(Object i:ch)
		{
			if(ch.length==7)
			{
				System.out.println(i);
			}
		}

	}

}
