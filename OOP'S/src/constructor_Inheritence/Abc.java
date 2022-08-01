package constructor_Inheritence;

public class Abc {
	
Abc()
{  
	//this(100);
	System.out.println("In default constructor ");
}
Abc(int a)
{
	this();
	System.out.println("In single parameter constructor "+a);
}
Abc(int a,int b)
{
	this(100);
	System.out.println("In 2 parameter constructor "+b);
}
Abc(int a,int b,int c)
{
	this(100,200);
	System.out.println("In 2 parameter constructor "+b);
}
public static void main(String[] args) {
	
	Abc z=new Abc(100,20,30);
	
}

}
