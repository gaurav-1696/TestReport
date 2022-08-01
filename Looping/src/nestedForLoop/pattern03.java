package nestedForLoop;

import java.util.Scanner;

public class pattern03 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int i,j,r;
r=sc.nextInt();
for(i=1;i<=r;i++)
{
	for(j=0;j<r;j++)
	{
		System.out.print(((i+j)%2)+" ");
	}
	System.out.println();
	sc.close();
}
}
}
