package classesObjects;

import java.util.Scanner;

public class BankMain {
public static void main(String[] args) {
	


    Scanner sc=new Scanner(System.in);
   System.out.println("enter detail");
   
    int accno=sc.nextInt();
    
    String name=sc.next();
    int amt=sc.nextInt();
    String contact=sc.next();
    
    Account a1= new Account();
   a1.setAccno(accno);
   a1.setName(name);
   a1.setBalance(amt);
   a1.setContact(contact);
   System.out.println("enter amount");
   amt=sc.nextInt();
   System.out.println();
   Bank b1=new Bank();
		   b1.gpay(amt, a1);
   sc.close(); 
}   
      
      
} 
    
    
    

