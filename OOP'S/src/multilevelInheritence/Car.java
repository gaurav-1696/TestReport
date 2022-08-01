package multilevelInheritence;

public class Car {
  String name;
  String brandName;
  int price,launchYr;
  void setData(String name,String brandName,int launchYr,int price)
  {
	  this.name=name;
	  this.brandName=brandName;
	  this.launchYr=launchYr;
	  this.price=price;
  }
  void display()
  {
	  System.out.println(name+" "+brandName+" "+launchYr+" "+price);
  }
  
}
