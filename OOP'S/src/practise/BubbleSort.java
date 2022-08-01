package practise;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 2, 6, 4, 5, 9, 1, 3, 7 };
		int d = arr.length;
		for (int i = 0; i < d; i++) {
			for (int j = i + 1; j < d; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------------");
		for(int i=0;i<d;i++)
		{
			for(int j=i+1;j<d-1;j++)
			{
				if(arr[i]<arr[j+1])
				{
					int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
