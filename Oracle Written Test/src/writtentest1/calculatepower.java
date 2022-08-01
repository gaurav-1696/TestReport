package writtentest1;

import java.util.Scanner;

public class calculatepower {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);// Scanner sc=new Scanner(System.in);
  System.out.println("enter any number");//
  int r=1;                                // int r=1;
  int n=sc.nextInt();                      //n=sc.nextInt();
  System.out.println("enter the power");    
  int power=sc.nextInt();
  for(int i=1;i<=power;i++)    //for(i=1;i<=power;i++)
  { 
	  r=n*r;                      //r=n*r;
  }
  System.out.println("power= "+r);   
  
  sc.close();
	}

}
