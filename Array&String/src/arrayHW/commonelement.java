package arrayHW;

public class commonelement {
 public static void main(String[] args) {
	 int arr1[]= {12,23,34,67,78,91,56};
	 int arr2[]= {39,25,15,23,55,91};
	 
	 for(int i=0;i<arr1.length;i++)
	 {
		 for(int j=0;j<arr2.length;j++)
		 {
			 if(arr1[i]==arr2[j])
			 {
				 System.out.println("common number's are: "+arr1[i]);
			 }
		 }
	 }
}
}
