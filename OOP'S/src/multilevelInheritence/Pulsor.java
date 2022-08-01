package multilevelInheritence;

public class Pulsor extends Bike {
	int weight;
	  String name,modelno;
	  
	  void setPulsarData(String name,int weight,String modelno)
	  {
		  this.weight=weight;
		  this.modelno=modelno;
		  this.name=name;
	  }
	  public String toString()
	  {
		  return weight+" "+modelno+" "+name;
	  }
	  void engine()
	  {
		  System.out.println("220 cc");
	  }
	  void gears()
		{
		  super.gears();//override
			System.out.println("Pulsor having 5 gears");
		}
}
