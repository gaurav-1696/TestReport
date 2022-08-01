package inheritence;

public class Father extends GrandFather {
  String ffirstName;
  void setFatherData(String ffirstName)
  {
	  this.ffirstName=ffirstName;
  }
  public void display()
  {
	  super.display();
	  System.out.println(ffirstName+" "+super.firstName+" "+lastName);
  }
}
