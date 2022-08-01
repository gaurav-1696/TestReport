package arrayLIst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListToArray {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(200);
	al.add(20);
	al.add(400);
	al.add(520);
	al.add(20004);
	al.add(200);
	al.add(20);
	al.add(400);
	al.add(520);
	al.add(20004);
	
	
	System.out.println(Collections.frequency(al, 400));
	System.out.println(al);
	Collections.sort(al); //ascending order
System.out.println(al);

//descending order
Collections.reverse(al);
System.out.println(al);
	int arr[]=new int[al.size()];
	for(int i=0;i<al.size();i++)
	{
		arr[i]=al.get(i);
	}
	System.out.println(Arrays.toString(arr));
	
	
	Integer ai[]=new Integer[al.size()];
	al.toArray(ai);
	
	System.out.println("Object array "+Arrays.toString(ai));
}
}
