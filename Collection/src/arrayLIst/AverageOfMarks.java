package arrayLIst;

import java.util.ArrayList;

public class AverageOfMarks {

	public static void main(String[] args) {
     ArrayList<Float> a1 = new ArrayList<>();
		
		a1.add(90f);
		a1.add(60f);
		a1.add(75f);
		a1.add(65f);
		a1.add(78f);
		
		System.out.println(a1);
		
        float avg = 0;
		
		for(int i=0; i<a1.size(); i++)
		{
			avg = avg+a1.get(i);
		}
		float total=avg/a1.size();
		System.out.println("Average: "+total);

	}

}
