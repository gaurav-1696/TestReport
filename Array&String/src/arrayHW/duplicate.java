package arrayHW;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 50, 70, 80, 30, 90, 20, 80, 70, 80, 70 }; // duplicate value
		int len = arr.length;

		System.out.println("duplicate values of an array =  ");

		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++)
			{
				if (arr[i] == arr[j]) 
				{
					System.out.println(arr[j] + "  ");
				}
			}
		}
		sc.close();
	}
}
