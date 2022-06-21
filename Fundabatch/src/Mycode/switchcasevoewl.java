package Mycode;

import java.util.Scanner;

public class switchcasevoewl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'A':
			System.out.println("vowel");
			break;
		case 'E':
			System.out.println("vowel");
			break;
		case 'I':
			System.out.println("vowel");
			break;
		case 'O':
			System.out.println("vowel");
			break;
		case 'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonent");

		}

	}

}
