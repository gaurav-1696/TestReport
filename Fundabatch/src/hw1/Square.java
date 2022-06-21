package hw1;

import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the given number");
	int a=sc.nextInt();
	int sq=a*a;
	int cub=a*a*a;
	System.out.println("square= "+sq);
	System.out.println("cube= "+cub);
}
}
