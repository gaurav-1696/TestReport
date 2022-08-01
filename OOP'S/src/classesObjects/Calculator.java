package classesObjects;

public class Calculator {
  public void add(int a,int b) //parameter
  {
	 // int a=10,b=20; //local variable a,b
	  System.out.println("Addition is: "+(a+b));
  }
  public void substract()
  {
	  int a=20,b=5;
	  System.out.println("Substraction is: "+(a-b));
  }
  public void multiplication()
  {
	  int a=12,b=3;
	  System.out.println("Multiplication is: "+(a*b));
  }
  public void division()
  {
	  int a=25,b=2;
	  System.out.println("Division is: "+(a/b));
  }
  public static void main(String[] args) {
	Calculator c1=new Calculator();
	c1.add(10,20);
	c1.substract();
	c1.multiplication();
	c1.division();
	
	System.out.println("1");
	c1.add(10,20);
	System.out.println("2");
	c1.substract();
	System.out.println("3") ;
	c1.multiplication();
	System.out.println("4");
	c1.division();
	
}
}
