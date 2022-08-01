package Mycode;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int age = sc.nextInt();
		switch (age) {
		case 18:
			System.out.println("you are eligible for vote");
			break;
		case 16:
			System.out.println("you are not eligible for vote");
			break;
		case 13:
			System.out.println("you are teeneger");
			break;
		default:
			System.out.println("enjoy you're life");

		}
sc.close();
	}
}
