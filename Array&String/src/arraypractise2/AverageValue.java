package arraypractise2;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		int avg = sum / size;
		System.out.println("average of given array="+avg);
		
sc.close();
	}

}
