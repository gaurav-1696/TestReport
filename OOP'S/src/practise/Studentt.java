package practise;

public class Studentt {
  int id,marks;
  String name,contact;
  Studentt(int id,String name,int marks,String contact)
  {
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
	  this.contact=contact;
  }
  public String toString()
  {
	  return id+" "+name+" "+marks+" "+contact;
  }
}
