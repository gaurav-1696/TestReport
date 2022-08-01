package exception;

import java.util.Scanner;

public class Ex1 {
	static void array(int arr[], int i) {
		System.out.println("elements at the index is: " + arr[i]);
	}

	static void string(String s, int a) {
		System.out.println(s.charAt(a));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 5, 6, 4, 8, 9 };
		String s="India";
		System.out.println("enter index:");
		int i = sc.nextInt();
		System.out.println("enter char index:");
		int a = sc.nextInt();

		try {
			try 
			{
				array(arr, i);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				
				e.printStackTrace();
			}
			string(s, a);
		}
		catch (StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("Done");
		sc.close();
	}
}
