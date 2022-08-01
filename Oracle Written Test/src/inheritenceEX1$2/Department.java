package inheritenceEX1$2;

public class Department extends Student {
  String named;
  int i;
  void setDepartmentData(int i,String named)
  {
	  this.i=i;
	  this.named=named;
  }
  public String toString()
  {
	  return i+" "+named+" "+id+" "+name+" "+marks+" "+contact;
  }
}
