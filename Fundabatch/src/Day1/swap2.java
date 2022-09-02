package Day1;

import java.util.Scanner;

public class swap2 {
	
	  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in); 
	  System.out.println("enter two numbers");
	  int a = sc.nextInt(); ///a=10
	  int b = sc.nextInt();  // b=20
	  a = a + b;  //a=10+20;a=30
	  b = a - b;  //b=30-20; b=10
	  a = a - b;  // a=30-10; a=20
	  System.out.println("a = " + a); 
	  System.out.println("b = " + b); 
	  sc.close(); 
	  }
	  
	  }
	 
// Second method

class swap20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = sc.nextInt();  //a=10;
		int b = sc.nextInt();  //b=20;
		int c = a; //c=10;7
		a = b;    //a=20;
		b = c;   // b=10;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		sc.close();
	}
}

