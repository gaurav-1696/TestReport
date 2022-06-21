package Arrays;

public class maxnumber {
	public static void main(String[] args) {
		
	
   int arr[]= {4,3,5,2,1,6};
   int max=arr[0];
   for(int i=1;i<arr.length;i++)
   {
	   if(arr[i]>max)
	   {
		   max=arr[i];
	   }
   }
   System.out.println("max number is:");
   System.out.println(max);
	}
}
