package com.dowhile;

import java.util.Scanner;

public class menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int ch,a,b;
  char c='n';
  do
  {
	  System.out.println("1.addition");
	  System.out.println("2.substraction");
	  System.out.println("3.multiplication");
	  System.out.println("4.division");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the choice:");
	  ch=sc.nextInt();
	  
	  System.out.println("enter 2 number:");
	  a=sc.nextInt();
	  b=sc.nextInt();
	  
	  switch(ch)
	  {
	  case 1: System.out.println("Addition is: "+(a+b));
	  break;
	  case 2: System.out.println("Substraction is: "+(a-b));
	  break;
	  case 3: System.out.println("Multiplication is: "+(a*b));
	  break;
	  case 4: System.out.println("division is: "+(a/b));
	  break;
	  default: System.out.println("invalid input");
	  
	  }
	  System.out.println("Do you want to continue: (y/n)");
	  c=sc.next().charAt(0);
	  sc.close();
  }while(c=='y' || c=='n');
	}

}
