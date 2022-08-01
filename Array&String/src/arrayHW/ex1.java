package arrayHW;

import java.util.Scanner;

public class ex1 {
	
	  public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	  int size=10;	  
	  int a[]=new int[size];
	  System.out.println("enter"+size+" elements");
	  
	  for(int i=0;i<size;i++)
	  { a[i]=sc.nextInt();
	  }
	  System.out.println("element array are: "); for(int i=0;i<size;i++) 
	  {
	  System.out.print(a[i]+" "); } sc.close(); 
	  }
	 
	// public static void main(String args[]) 
	 { 
	 String str1 = "java"; 
	 char arr[] = { 'j', 'a', 'v', 'a', ' ', 'p',
	 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' }; 
	 String str2 = new String(arr); 
	 System.out.println(str1); 
	 System.out.println(str2); 
	 }
}