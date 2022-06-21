package pattern;

import java.util.Scanner;

public class threeDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		if (n >= 100 && n < 999) {
			int lastDigit = n % 10;
			int two = n / 10;
			int first = two / 10;
			int mid = two % 10;
			int add = lastDigit + mid + first;
			System.out.println("Sum of the thre digit: " + add);

		} else {
			System.out.println("itis not three digit number");
		}
		                         //OR

		for (int i = n; i <= n; i++) {
			int lastDigit = n % 10;
			int two = n / 10;
			int first = two / 10;
			int mid = two % 10;
			int add = lastDigit + mid + first;
			System.out.println("Sum of the thre digit: " + add);
		}

		sc.close();
	}

}
