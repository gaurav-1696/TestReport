package multilevelInheritence;

public class PulsorRS extends Pulsor {
  String engine;
  int speed;
  void setPulsorRSData(String engine,int speed)
  {
	  this.engine=engine;
	  this.speed=speed;
  }
  public String toString()
  {
	  return name+" "+modelno+" "+milage+" "+weight+"kg "+price+ " "+color+" "+engine+" "+speed+" "+brand;
  }
  void gears()
	{
	  super.gears();//override
		System.out.println("Pulsor RS having 6 gears");
	}

}
