package hwWhileLoop;

import java.util.Scanner;

public class tableofgivenno {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int i=1;
while(i<=10)
{
int g=i*n;
	System.out.println(g);
	i++;
}
sc.close();
	}

}
