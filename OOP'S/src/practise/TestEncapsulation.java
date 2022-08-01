package practise;

import java.util.Scanner;

public class TestEncapsulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long acc_no = sc.nextLong();
		String name = sc.next();
		String email = sc.next();
		float amount = sc.nextFloat();

		Account acc = new Account();
		acc.setAcc_no(acc_no);
		acc.setName(name);
		acc.setEmail(email);
		acc.setAmount(amount);
		System.out.println(acc);
		sc.close();
	}
}