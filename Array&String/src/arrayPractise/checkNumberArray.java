package arrayPractise;

import java.util.Scanner;

public class checkNumberArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		System.out.println("enter the array element");
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the number to check");
		int n = sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (n == a[i])

				System.out.println("Given " + n + " number is present in a array");

		}

		{
			System.out.println("given number is not present in a array");
		}

		sc.close();
	}
}
