package com.xobin;

import java.util.Scanner;

public class Xobin_14_08_2022 {

	public static int secondHighest(int... a) {

		int high1 = 0, high2 = 0; // WRITE LOGIC HERE

		for (int i = 0; i < a.length; i++) {
			if (a[i] > high1) {
				high2 = high1;
				high1 = a[i];
			} else if (a[i] > high2)

			{
				high2 = a[i];
			}

		}
		return high2;

	}

	public static void main(String[] args) {

		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
			// WRITE LOGIC HERE TO TAKE INPUT FRO ARRAY
		}

		// WRITE LOGIC HERE FOR PROBLEM STATEMENT for (int j=0;j<a.length;j++)
		for (int j = 0; j < a.length; j++) {
			if (a[j] < Xobin_14_08_2022.secondHighest(a)) {

				sum += a[j];
			}
			
		}
		System.out.println(sum);
	sc.close();
	}
}