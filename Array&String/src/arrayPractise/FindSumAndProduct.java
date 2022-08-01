package arrayPractise;

import java.util.Scanner;

public class FindSumAndProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		System.out.println("enter the array element");
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0, product = 1;
		for (int i = 0; i < size; i++) {
			sum = sum + a[i];
			product = product * a[i];
		}
		System.out.println("Addition of array :" + sum);
		System.out.println("Product of array: " + product);
		sc.close();
	}

}
