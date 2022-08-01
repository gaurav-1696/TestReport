package practise;

public abstract class Vehicle {
  abstract void start();
}
class Carr extends Vehicle{
	public void start()
	{
		System.out.println("Car starts with with Key");
	}
}
class Scooter extends Vehicle{
	public void start()
	{
		System.out.println("Scooter stars with kick");
	}
	public static void main(String[] args) {
		Carr c=new Carr();
		c.start();
		Scooter s=new Scooter();
		s.start();
	}
}