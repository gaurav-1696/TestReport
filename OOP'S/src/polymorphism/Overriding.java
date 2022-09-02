package polymorphism;

public class Overriding extends Overloading {
	
	void eat(int a)
	{
		System.out.println("123");
	}
	void eat(float s,int b)
	{
		System.out.println("4652");
	}
	void eat(int g,int c)
	{
		System.out.println("myname is fdf ");	
	}
	public static void main(String[] args) {
		Overriding e= new Overriding();
		e.eat(12);
	}
	}


