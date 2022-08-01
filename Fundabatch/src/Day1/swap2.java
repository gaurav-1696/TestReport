package Day1;

import java.util.Scanner;

public class swap2 {
	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc = new Scanner(System.in); System.out.println("enter two numbers");
	 * int a = sc.nextInt(); int b = sc.nextInt(); a = a + b; b = a - b; a = a - b;
	 * System.out.println("a = " + a); System.out.println("b = " + b); sc.close(); }
	 * 
	 * }
	 */
// Second method

class swap20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		sc.close();
	}
}
}
