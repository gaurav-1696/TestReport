package array;

import java.util.Scanner;

public class SymmetricMatrix {
	public static void main(String[] args) {
		int r, c, count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and col");
		r = sc.nextInt();
		c = sc.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		System.out.println("eneter the " + (r * c) + " element");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}

		}
		System.out.println(" elements of the matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("  ");
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				b[j][i] = a[i][j];
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (a[i][j] != b[j][i]) {
					count++;
					break;
				}

			}
			if (count == 1) {

				System.out.println("The given matrix is symmetric");
				break;
			} else {
				System.out.println("The given matrix is not symmetric");
			}
		}
		sc.close();
	}
}
