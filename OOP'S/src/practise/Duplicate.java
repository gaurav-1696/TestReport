package practise;

public class Duplicate {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 10, 52, 2, 4, 2 };
		System.out.println("duplicate number are:");
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
