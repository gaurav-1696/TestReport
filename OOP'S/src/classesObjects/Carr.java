package classesObjects;

public class Carr {
	int id,year,price,installment,discount;
	  String name,brandname,payment;
	  int getId()
	  {
		  return id;
	  }
	  void setId(int id)
	  {
		  this.id=id;
	  }
	  int getPrice()
	  {
		  return price;
	  }
	  void setPrice(int price)
	  {
		  this.price=price;
	  }
	  String getName()
	  {
		  return name;
	  }
	  void SetName(String name)
	  {
		  this.name=name;
	  }
	  String getyear()
	  {
		  return name;
	  }
	  void setYear(int year)
	  {
		  this.year=year;
	  }
	  void setBrandName(String brandname) {
		  this.brandname=brandname;
	  }
	  String getBrandName()
	  {
		  return brandname;
	  }
	  public String toString()
	   {
		   return id+" "+name+" "+year+" "+price+" "+brandname+" ";
	   }
	  
	  
	  
}
