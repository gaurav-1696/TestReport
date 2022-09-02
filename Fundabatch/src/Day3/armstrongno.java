package Day3;

import java.util.Scanner;

public class armstrongno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Accept the no.");
		int n = sc.nextInt();

		if (n >= 100 && n <= 999) {
			System.out.println("this is three digit no");
			int lastdigit = n % 10;
			int two = n / 10;
			int first = two / 10;
			int mid = two % 10;
			int add = (lastdigit * lastdigit * lastdigit) + (first * first * first) + (mid * mid * mid);
			System.out.println("sum of cube =" + add);
			if (add == n)
				System.out.println("given no. is armstrong");
			else
				System.out.println("given no. is not armstrong");
		} else {
			System.out.println("this is not three digit no");
		}
		sc.close();
	}
}
