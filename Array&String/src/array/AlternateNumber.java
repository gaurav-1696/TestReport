package array;



public class AlternateNumber {
  public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); int size; size=sc.nextInt(); int a[]=new
		 * int[size]; System.out.println("enter the number"); for(int i=0;i<size;i++) {
		 * a[i]=sc.nextInt(); } for(int i=0;i<size;i=i+2) { System.out.println(a[i]); }
		 */
	int a1[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	for(int i=0;i<a1.length-2;i++)
	{
		sum=a1[i]+a1[i+2];
		System.out.println(sum+" ");
	}
	//System.out.println(sum);

	
}
}
