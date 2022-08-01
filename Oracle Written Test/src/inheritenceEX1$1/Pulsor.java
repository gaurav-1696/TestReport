package inheritenceEX1$1;

public class Pulsor extends Bike
{
	 int weight;
	  String name,modelno;
	  
	  void setPulsarData(String name,int weight,String modelno)
	  {
		  this.weight=weight;
		  this.modelno=modelno;
		  this.name=name;
	  }
	  void engine()
	  {
		  System.out.println("220 cc");
	  }
	  public String toString()
	  {
		  return name+" "+modelno+" "+milage+" "+weight+" "+price+ " "+color;
	  }
}
