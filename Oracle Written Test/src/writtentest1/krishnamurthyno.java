package writtentest1;

import java.util.Scanner;

public class krishnamurthyno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		int temp = n, facto = 1;
		int sum = 0;

		while (temp != 0) {
			int r = temp % 10;
			facto = 1;
			for (int i = 1; i <= r; i++) {
				facto = facto * i;
			}
			sum = sum + facto;
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.println("given number is krishnamurthy");
		} else {
			System.out.println("is not a krishnamurthy number");
		}
		sc.close();
	}

}
