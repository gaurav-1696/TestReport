package writtentest1;

import java.util.Scanner;

public class productofdigits {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("ENTER THE NUMBER");
		  int num, p=1;
		  num=sc.nextInt();
		  while(num!=0)
		  {
			  int r=num%10;
			  num=num/10;
			p=p*r;
			  
 
		  }
		 System.out.println("Product = "+p); 
		  
		  
		  
		 sc.close();
	}

}
