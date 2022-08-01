package classesObjects;

public class Account {
  int accno,balance;
  String name,contact;
  int getbalance()
  {
	  return balance;
  }
  void setBalance(int balance)
  {
	  this.balance=balance;
	  
  }
  void setAccno(int accno)
  {
	  this.accno=accno;
  }
  int getAccno()
  {
	  return accno;
  }
  String getName()
  {
	  return name;
  }
  void setName(String name)
  {
	  this.name=name;
  }
  String getcontact()
  {
	  return contact;
  }
  void setContact(String contact)
  {
	  this.contact=contact;
  }
  
}
