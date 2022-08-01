package inheritence;

public class GrandFather {
  String firstName,middleName,lastName;
 public void setGrandFatherData(String firstName,String middleName,String lastName)
  {
	  this.firstName=firstName;
	  this.middleName=middleName;
	  this.lastName=lastName;
  }
  public void display ()
  {
	  System.out.println(firstName+" "+middleName+" "+lastName);
  }
}
