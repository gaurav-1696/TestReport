package interfaceInJava;

public  class SciCalculator implements Calculator {
	public void add()
	{
		int m=10,n=20;
		System.out.println("Additon= "+(m+n));
	}
	public void substract()
	{
		int m=15,n=8;
		System.out.println("Substraction= "+(m-n));
	}
	public void multiply()
	{
		int a=5,b=8;
		System.out.println("Multiplication= "+(a*b));
	}
	public void divide()
	{
		int a=100,b=50;
		System.out.println("Division= "+(a/b));
	}
	public void power()
	{
		double power=Math.pow(2, 3);
		System.out.println("Power= "+power);
	}
	public void sqroot()
	{
		double sqrt=Math.sqrt(16);
		System.out.println("Squareroot= "+sqrt);
	}
}
