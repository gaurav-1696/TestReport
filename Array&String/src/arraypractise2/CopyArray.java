package arraypractise2;

public class CopyArray {

	public static void main(String[] args) {
		
        //initialize array
		int arr1[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int arr2[]=new int[arr1.length];
		//copying all elements 
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("first array");
		for(int i=0;i<arr1.length;i++)
			
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\nSecond array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
