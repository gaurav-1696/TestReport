package classesObjects;

import java.util.Scanner;

public class SimpleInterest {
	int cal(int p, int r, int t) {
		return p * r * t;
	}
	void y(int p, int r, int t) {
		double si = cal(p, r, t) / 100;
		System.out.println("Simple interest: " + si);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount rate and time:");
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		SimpleInterest s1 = new SimpleInterest();
		s1.y(p, r, t);
		sc.close();
	}

}