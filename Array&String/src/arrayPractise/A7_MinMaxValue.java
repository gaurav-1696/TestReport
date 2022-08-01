package arrayPractise;

public class A7_MinMaxValue {

	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min =arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Min value from arrays ="+min);
		System.out.println("Max value from array ="+max);

	}

}
