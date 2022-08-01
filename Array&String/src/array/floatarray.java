package array;

import java.util.Scanner;

public class floatarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int size = 10;
		float sum = 0;
		float avg = 0;

		float a[] = new float[size];
		System.out.println("enter" + size + " elements");
		for (int i = 0; i < size; i++) {
			a[i] =sc.nextFloat();
		}

		for (int i = 0; i < size; i++) {
			sum = sum + a[i];
			avg = sum / 10;

		}
		System.out.println("average: " + avg);
		sc.close();
	}
}
