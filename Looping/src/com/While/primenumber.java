package com.While;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {

		System.out.println("enter the number");

		int i = 400;
		int mid = 300 / 2;
		for (i = 400; i >= mid; i--)

		{
			if (300 % i == 0) {

				break;
			}

		}
		if (i > mid) {
			System.out.println("given number is  prime");
		} else {
			System.out.println("given number is not prime");
		}

	}

}
