package polymorphismEX3;

import java.util.Scanner;

public class Comparemain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Compare_int b = new Compare_int();

		System.out.print("Enter the  first integer: ");
		int c1 = sc.nextInt();
		System.out.print("Enter the second integer: ");
		int c2 = sc.nextInt();
		sc.nextLine();
		b.compare(c1, c2);
		System.out.print("Enter the  first character: ");
		char s1 = sc.next().charAt(0);
		System.out.print("Enter  the second character: ");
		char s2 = sc.next().charAt(0);
		sc.nextLine();
		b.compare(s1, s2);
		sc.close();
	}

}
