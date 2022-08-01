package nestedForLoop;

import java.util.Scanner;

public class pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		 int i,j,r;
	   r=sc.nextInt();
		for ( i = 1; i <= r; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for ( i = r; i >= 1; i--) {

			for (j = 1; j < i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
