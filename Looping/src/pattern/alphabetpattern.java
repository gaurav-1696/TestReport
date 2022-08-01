package pattern;

import java.util.Scanner;

public class alphabetpattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int r,j,i;
	char ch='a';
	 r=sc.nextInt();
	 for(i=1;i<=r;i++)
	 {
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(ch+" ");
		 }
		 System.out.println();
		 ch++;
	 }
}
}
