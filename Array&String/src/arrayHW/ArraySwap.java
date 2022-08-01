package arrayHW;

import java.util.Arrays;

public class ArraySwap {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int size = 5;
		int b = size / 2;
		for (int i = 0; i < size / 2; i++) 
		{
			int temp = arr[i];
			arr[i] = arr[b];
			arr[b] = temp;
			b++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
