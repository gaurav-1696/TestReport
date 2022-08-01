package array;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c,sum=0;
		System.out.println("enter the number of rows: ");
         r=sc.nextInt();
         System.out.println("enter the numbur of columns: ");
         c=sc.nextInt();
         int a[][]=new int[r][c];
         System.out.println("enter the elements of the matrix");
         for(int i=0;i<r;i++)
         {
        	 for(int j=0;j<c;j++)
        	 {
        		 a[i][j]=sc.nextInt();
        	 }
         }
         System.out.println("element of the matrix: ");
         for(int i=0;i<r;i++)
         {
        	 for(int j=0;j<c;j++)
        	 {
        		 System.out.print(a[i][j]+"\t ");
        	 }
        	 System.out.println();
         }
         for(int i=0;i<r;i++)
         {
        	 for(int j=0;j<c;j++)
        	 {
        		 if(i==j)
        		 {
        			 sum=sum+a[i][j];
        		 }
        	 }
         }
         System.out.println("sum of diagoanal elements= "+sum);
         sc.close();	
      }
}
