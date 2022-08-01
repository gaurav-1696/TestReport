package constructor_Inheritence;

public class A {
 
	A()
	{
		System.out.println("In default constructor A class");
	}
	A(int a,int b)
	{
		System.out.println("In parameterised constructor a class "+a);
	}
	
}
class B extends A
{   int a=30;
	B()
	{
		super(100,200);
		System.out.println("In default constructor B class");
	}
	B(int a)
	{
		super(100,200);
		System.out.println("In parameterized constructor B class"+a);
	}
	void display()
	{
		System.out.println("In class B display method"+a);
	}
	public static void main(String[] args) {
		B b=new B();
		b.display();
}
}
	


