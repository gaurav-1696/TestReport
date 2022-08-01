package arraypractise2;

public class PrintArrayInReverse {

	public static void main(String[] args) {
	System.out.println("1)");
int arr[]= {1,2,3,4,5,6,7,8,9,10};
System.out.println("Printed Array in reverse");
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(arr[i]+" ");
}
System.out.println("\n*************************");
System.out.println("2)");
int a[]= {3,90,45,29,37,78};
System.out.println("reverse array");
for(int i=a.length-1;i>=0;i--)
{
	System.out.print(a[i]+"  ");
}


	}

}
