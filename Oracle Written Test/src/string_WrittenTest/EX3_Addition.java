package string_WrittenTest;

public class EX3_Addition {

	public static void main(String[] args) {

		String s = "THE SKY IS THE LIMIT";
		String str[] = s.split(" ");
		int s1[] = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			int sum = 0;
			for (int j = 0; j < str[i].length(); j++) {
				sum = sum + ((str[i].charAt(j)) - 64);
			}
			System.out.println(str[i] + " " + sum);
			s1[i] = sum;
		}
		System.out.println("--------------------");
		for (int i = 0; i < s1.length; i++) {
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i] > s1[j]) {
					int temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;

					String a = str[i];
					str[i] = str[j];
					str[j] = a;
				}
			}
			System.out.println(s1[i] + " " + str[i]);
		}

	}
}
