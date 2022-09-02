package polymorphism;

public class Overloading {
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
	System.out.println("myname is Gaurav ");	
}
public static void main(String[] args) {
	Overloading o=new Overloading();
	o.eat(12);
	o.eat(12, 223);
	o.eat(45, 23);
}
}
