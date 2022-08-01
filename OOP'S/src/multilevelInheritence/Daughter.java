package multilevelInheritence;

public class Daughter extends Father {
  String vehicle;
  void setDaughterData(String vehicle)
  {
	  this.vehicle=vehicle;
  }
  public String toString ()
  {
	  return name+" "+surname+" "+age+" "+vehicle;
  }
}
