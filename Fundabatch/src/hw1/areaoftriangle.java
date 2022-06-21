package hw1;

import java.util.Scanner;

public class areaoftriangle {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the height and base");
	int h=sc.nextInt();
	int b=sc.nextInt();
	int area=(b*h)/2;
System.out.println("area of triangle is "+area);
}
}
