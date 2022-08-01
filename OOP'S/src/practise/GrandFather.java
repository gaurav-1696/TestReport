package practise;

public class GrandFather {
  String firstName,middleName,lastName;
  void setGrandFatherData(String firstName,String middleName,String lastName)
  {
	  this.firstName=firstName;
	  this.middleName=middleName;
	  this.lastName=lastName;
  }
  void display() {
	  System.out.println(firstName+" "+middleName+" "+lastName);
  }
}
