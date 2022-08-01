package pattern;

import java.util.Scanner;

public class rightangledtri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int r, i = 0;
		r = sc.nextInt();
		for (i = 0; i <= r; i++) {
			for (int j = 1; j <= r - i; j++) {
				System.out.print(" ");
			}
			for (int a = 0; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
