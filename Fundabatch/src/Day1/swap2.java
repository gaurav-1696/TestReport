 package Day1;

import java.util.Scanner;

//public class noswap {
//  public static void main(String[] args) {
//  Scanner sc=new Scanner(System.in);
//  System.out.println("enter two numbers");
//  int a=sc.nextInt();
//  int b=sc.nextInt();
//  a=a+b;
//  b=a-b;
//  a=a-b;
//  System.out.println("a = "+a);
//  System.out.println("b = "+b);
//}
//}
 //Second method
 public class swap2 {
	  public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter two numbers");
		  int a=sc.nextInt();
		 int b=sc.nextInt();
		 // int a=90;
		  //int b=80;
//		  System.out.println("a="+a);
//		  System.out.println("b="+b);
		  int c=a;
		  a=b;
		  b=c;
		  System.out.println("a="+a);
		  System.out.println("b="+b);
		sc.close();  
	  }
	}
