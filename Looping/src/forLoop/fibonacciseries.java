package forLoop;

public class fibonacciseries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum;
			for (int i = 1; i <= 10; i++) {
			sum = a + b;
			System.out.print(" " + a);
			a = b;
			b = sum;
		}
	}
}