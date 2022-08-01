package arrayPractise;

import java.util.Scanner;

public class ArrayOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		System.out.println("enter the array elements");
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("odd elements from a given array");
		int i = 0;
		int sum = 0;
		while (i < size)

		{
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
				sum = sum + a[i];
			}
			i++;
		}
		System.out.println("Addtion of odd elements=" + sum);
		sc.close();
	}
}
