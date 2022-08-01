package classesObjects;

public class Bank {
  void gpay(int amt, Account a)
  {
	  int bal=a.getbalance();
	  System.out.println("Available balance: "+a.getbalance());
	  if(bal>amt)
	  {
		 bal=bal-amt;
		 a.setBalance(bal);
		  System.out.println("remaining balance: "+a.getbalance());
	  }
	  else
		  System.out.println("insufficient balance");
  }
}
