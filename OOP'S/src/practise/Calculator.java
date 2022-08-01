package practise;

public class Calculator {
public void add()
{
	int a=10, b=20;
	System.out.println("addition is: "+(a+b));
}
public void substract()
{
	int a=20,b=10;
	System.out.println("Substarction is: "+(a-b));
}
public void multiplication()
{
	int a=10,b=85;
	System.out.println("multiplication is: "+(a*b));
}
public void division()
{
	int a=10,b=2;
	System.out.println("division is: "+(a/b));
}
public static void main(String[] args) {
	Calculator c=new Calculator();
	c.add();
	c.substract();
	c.multiplication();
	c.division();
	//System.out.println("1");
	
}
}
