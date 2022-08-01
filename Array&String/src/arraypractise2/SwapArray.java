package arraypractise2;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 9, 0 };
		int b = arr.length / 2;
		for (int i = 0; i < arr.length / 2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[b];
			arr[b] = temp;
			b++;

		}
		System.out.println(Arrays.toString(arr));
	}

}
