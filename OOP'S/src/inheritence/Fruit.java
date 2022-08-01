package inheritence;

public class Fruit {

	void eat()
	{
		System.out.println("1)eat mutton are very good for eyes");
	}
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("2)Apples are very good for eyes");
	}
}
class Straberry extends Fruit {
	void eat()
	{
		System.out.println("3)Strawberry are sweet is taste");
	}
}
class Bannana extends Fruit
{
	void eat()
	{
		System.out.println("4)Bannana having high pottassium");
	}
}
