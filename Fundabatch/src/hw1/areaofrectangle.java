package hw1;

import java.util.Scanner;

public class areaofrectangle {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length and breadth");
	int l=sc.nextInt();
	int b=sc.nextInt();
	int area=l*b;
	
	int p=2*l*b;
	System.out.println("area = "+area);
	System.out.println("perimeter = "+p);
}
}
