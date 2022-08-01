import java.util.Scanner;

public class array {
	static public  void main(String[] args) {
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the matrix data ");
	for(int i=0;i<2;i++)
	{
 		for(int j=0;j<2;j++)
 		{
 			a[i][j]=sc.nextInt();
 		}
	}
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	System.out.println("first matrix data");
	 for(int i=0;i<2;i++)
	 {
		 for(int j=0;j<2;j++)
		 {
			 System.out.print(a[i][j]+" ");
		 }
		 System.out.print("\n");
	 }
	 System.out.println("second  matrix data");
	 for(int i=0;i<2;i++)
	 {
		 for(int j=0;j<2;j++)
		 {
			 System.out.print(b[i][j]+" ");
		 }
		 System.out.print("\n");
	 }
	 System.out.println("Addition of two matrix is: ");
	 for(int i=0;i<2;i++)
	 {
		 for(int j=0;j<2;j++)
		 {
			 c[i][j]=a[i][j]+b[i][j];
			 System.out.print(c[i][j]+" ");
		 }
		 System.out.print("\n");
	 }
	 sc.close();
}
}
