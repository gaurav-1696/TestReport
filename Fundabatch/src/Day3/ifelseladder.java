package Day3;

import java.util.Scanner;

public class ifelseladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage");
		int percentage = sc.nextInt();
		if (percentage >= 75)
			System.out.println("u got distinction");
		else if (percentage >= 60)
			System.out.println("u got first class");
		else if (percentage >= 50)
			System.out.println("u got Second class");
		else
			System.out.println("Fail");
		sc.close();
	}
}
