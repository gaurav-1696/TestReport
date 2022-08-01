package arrayPractise;

import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		System.out.println("enter the 1 array");
		int a[] = new int[size];

		int b[] = new int[size];
		System.out.println("enter the 2 array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < size; j++) {
			b[j] = sc.nextInt();
		}
		System.out.println("commom elemnts are:");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}

			}
		}
		sc.close();
	}

}
