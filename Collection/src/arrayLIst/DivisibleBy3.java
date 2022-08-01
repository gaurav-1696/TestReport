package arrayLIst;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleBy3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the element");
		for(int i=0; i<size; i++)
		{		
			al.add(sc.nextInt());		
		}
		for(Integer e:al)
		{
			if(al.get(e)%3==0)
			{
				System.out.println(al.get(e));
			}
		}
			sc.close();
	}
}
